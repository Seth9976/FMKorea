package com.google.firebase.messaging;

import a2.e;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.g;
import y2.b;
import y2.d;

public class FirebaseMessaging {
    class a {
        private final d a;
        private boolean b;
        private b c;
        private Boolean d;
        final FirebaseMessaging e;

        a(d d0) {
            this.a = d0;
        }

        void b() {
            synchronized(this) {
                if(this.b) {
                    return;
                }
                Boolean boolean0 = this.e();
                this.d = boolean0;
                if(boolean0 == null) {
                    x x0 = new x(this);
                    this.c = x0;
                    this.a.b(a2.b.class, x0);
                }
                this.b = true;
            }
        }

        boolean c() {
            synchronized(this) {
                this.b();
                Boolean boolean0 = this.d;
                return boolean0 == null ? FirebaseMessaging.this.a.s() : boolean0.booleanValue();
            }
        }

        private void d(y2.a a0) {
            if(this.c()) {
                FirebaseMessaging.this.B();
            }
        }

        private Boolean e() {
            Context context0 = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
            if(sharedPreferences0.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences0.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 != null) {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.fmkorea.m.fmk", 0x80);
                    return applicationInfo0 == null || (applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            return null;
        }
    }

    private final e a;
    private final C2.e b;
    private final Context c;
    private final A d;
    private final P e;
    private final a f;
    private final Executor g;
    private final Executor h;
    private final Executor i;
    private final Task j;
    private final F k;
    private boolean l;
    private final Application.ActivityLifecycleCallbacks m;
    private static final long n;
    private static V o;
    static g p;
    static ScheduledExecutorService q;

    static {
        FirebaseMessaging.n = TimeUnit.HOURS.toSeconds(8L);
    }

    FirebaseMessaging(e e0, A2.a a0, B2.b b0, B2.b b1, C2.e e1, g g0, d d0) {
        this(e0, a0, b0, b1, e1, g0, d0, new F(e0.j()));
    }

    FirebaseMessaging(e e0, A2.a a0, B2.b b0, B2.b b1, C2.e e1, g g0, d d0, F f0) {
        this(e0, a0, e1, g0, d0, f0, new A(e0, f0, b0, b1, e1), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(e e0, A2.a a0, C2.e e1, g g0, d d0, F f0, A a1, Executor executor0, Executor executor1, Executor executor2) {
        this.l = false;
        FirebaseMessaging.p = g0;
        this.a = e0;
        this.b = e1;
        this.f = new a(this, d0);
        Context context0 = e0.j();
        this.c = context0;
        p p0 = new p();
        this.m = p0;
        this.k = f0;
        this.h = executor0;
        this.d = a1;
        this.e = new P(executor0);
        this.g = executor1;
        this.i = executor2;
        Context context1 = e0.j();
        if(context1 instanceof Application) {
            ((Application)context1).registerActivityLifecycleCallbacks(p0);
        }
        else {
            Log.w("FirebaseMessaging", "Context " + context1 + " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if(a0 != null) {
            a0.a(new q(this));
        }
        executor1.execute(new r(this));
        Task task0 = a0.e(this, f0, a1, context0, n.g());
        this.j = task0;
        task0.addOnSuccessListener(executor1, new s(this));
        executor1.execute(new t(this));
    }

    private void A() {
        synchronized(this) {
            if(!this.l) {
                this.C(0L);
            }
        }
    }

    private void B() {
        if(this.D(this.o())) {
            this.A();
        }
    }

    void C(long v) {
        synchronized(this) {
            this.j(new W(this, Math.min(Math.max(30L, 2L * v), FirebaseMessaging.n)), v);
            this.l = true;
        }
    }

    boolean D(com.google.firebase.messaging.V.a v$a0) {
        return v$a0 == null || v$a0.b(this.k.a());
    }

    @Keep
    static FirebaseMessaging getInstance(e e0) {
        synchronized(FirebaseMessaging.class) {
            FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)e0.i(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging0, "Firebase Messaging component is not present");
            return firebaseMessaging0;
        }
    }

    String i() {
        com.google.firebase.messaging.V.a v$a0 = this.o();
        if(!this.D(v$a0)) {
            return v$a0.a;
        }
        String s = F.c(this.a);
        v v0 = new v(this, s, v$a0);
        Task task0 = this.e.b(s, v0);
        try {
            return (String)Tasks.await(task0);
        }
        catch(ExecutionException | InterruptedException executionException0) {
            throw new IOException(executionException0);
        }
    }

    void j(Runnable runnable0, long v) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.q == null) {
                FirebaseMessaging.q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            FirebaseMessaging.q.schedule(runnable0, v, TimeUnit.SECONDS);
        }
    }

    Context k() {
        return this.c;
    }

    private static V l(Context context0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.o == null) {
                FirebaseMessaging.o = new V(context0);
            }
            return FirebaseMessaging.o;
        }
    }

    // 去混淆评级： 低(20)
    private String m() {
        return "[DEFAULT]".equals(this.a.l()) ? "" : this.a.n();
    }

    public Task n() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        u u0 = new u(this, taskCompletionSource0);
        this.g.execute(u0);
        return taskCompletionSource0.getTask();
    }

    com.google.firebase.messaging.V.a o() {
        return FirebaseMessaging.l(this.c).d(this.m(), F.c(this.a));
    }

    public static g p() {
        return FirebaseMessaging.p;
    }

    private void q(String s) {
        if("[DEFAULT]".equals(this.a.l())) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.l());
            }
            Intent intent0 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent0.putExtra("token", s);
            new m(this.c).i(intent0);
        }
    }

    public boolean r() {
        return this.f.c();
    }

    boolean s() {
        return this.k.g();
    }

    private Task t(String s, com.google.firebase.messaging.V.a v$a0) {
        Task task0 = this.d.e();
        w w0 = new w(this, s, v$a0);
        return task0.onSuccessTask(this.i, w0);
    }

    private Task u(String s, com.google.firebase.messaging.V.a v$a0, String s1) {
        FirebaseMessaging.l(this.c).f(this.m(), s, s1, this.k.a());
        if(v$a0 == null || !s1.equals(v$a0.a)) {
            this.q(s1);
        }
        return Tasks.forResult(s1);
    }

    private void v(TaskCompletionSource taskCompletionSource0) {
        try {
            taskCompletionSource0.setResult(this.i());
        }
        catch(Exception exception0) {
            taskCompletionSource0.setException(exception0);
        }
    }

    private void w() {
        if(this.r()) {
            this.B();
        }
    }

    private void x(a0 a00) {
        if(this.r()) {
            a00.o();
        }
    }

    private void y() {
        L.c(this.c);
    }

    void z(boolean z) {
        synchronized(this) {
            this.l = z;
        }
    }
}

