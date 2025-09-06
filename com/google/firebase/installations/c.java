package com.google.firebase.installations;

import C2.e;
import C2.g;
import D2.d;
import android.text.TextUtils;
import androidx.appcompat.app.E;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d2.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c implements e {
    class a implements ThreadFactory {
        private final AtomicInteger a;

        a() {
            super();
            this.a = new AtomicInteger(1);
        }

        @Override
        public Thread newThread(Runnable runnable0) {
            return new Thread(runnable0, String.format("firebase-installations-executor-%d", this.a.getAndIncrement()));
        }
    }

    static abstract class b {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[E2.f.b.values().length];
            b.b = arr_v;
            try {
                arr_v[E2.f.b.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[E2.f.b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[E2.f.b.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[E2.d.b.values().length];
            b.a = arr_v1;
            try {
                arr_v1[E2.d.b.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[E2.d.b.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final a2.e a;
    private final E2.c b;
    private final D2.c c;
    private final i d;
    private final x e;
    private final g f;
    private final Object g;
    private final ExecutorService h;
    private final Executor i;
    private String j;
    private Set k;
    private final List l;
    private static final Object m;
    private static final ThreadFactory n;

    static {
        c.m = new Object();
        c.n = new a();
    }

    c(a2.e e0, B2.b b0, ExecutorService executorService0, Executor executor0) {
        this(executorService0, executor0, e0, new E2.c(e0.j(), b0), new D2.c(e0), i.c(), new x(() -> c.y(e0)), new g());
    }

    c(ExecutorService executorService0, Executor executor0, a2.e e0, E2.c c0, D2.c c1, i i0, x x0, g g0) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = e0;
        this.b = c0;
        this.c = c1;
        this.d = i0;
        this.e = x0;
        this.f = g0;
        this.h = executorService0;
        this.i = executor0;
    }

    // 去混淆评级： 低(22)
    private String A(d d0) {
        if(!this.a.l().equals("CHIME_ANDROID_SDK") && !this.a.t() || !d0.m()) {
            return "f1z2YQiqQX-U5Kcy9mjm-J";
        }
        String s = this.o().f();
        return TextUtils.isEmpty(s) ? "f1z2YQiqQX-U5Kcy9mjm-J" : s;
    }

    private d B(d d0) {
        String s = d0.d() == null || d0.d().length() != 11 ? null : this.o().i();
        String s1 = this.l();
        String s2 = d0.d();
        String s3 = this.t();
        String s4 = this.m();
        E2.d d1 = this.b.d(s1, s2, s3, s4, s);
        switch(b.a[d1.e().ordinal()]) {
            case 1: {
                return d0.s(d1.c(), d1.d(), this.d.b(), d1.b().c(), d1.b().d());
            }
            case 2: {
                return d0.q("BAD CONFIG");
            }
            default: {
                throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.g);
            }
        }
    }

    private void C(Exception exception0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((h)object1).b(exception0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void D(d d0) {
        synchronized(this.g) {
            Iterator iterator0 = this.l.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((h)object1).a(d0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void E(String s) {
        synchronized(this) {
            this.j = s;
        }
    }

    private void F(d d0, d d1) {
        synchronized(this) {
            if(this.k.size() != 0 && !TextUtils.equals(d0.d(), d1.d())) {
                Iterator iterator0 = this.k.iterator();
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    E.a(object0);
                    d1.d();
                    throw null;
                }
            }
        }
    }

    @Override  // C2.e
    public Task a(boolean z) {
        this.z();
        Task task0 = this.f();
        C2.d d0 = () -> this.x(z);
        this.h.execute(d0);
        return task0;
    }

    // 检测为 Lambda 实现
    public static void b(c c0, boolean z) [...]

    // 检测为 Lambda 实现
    public static void c(c c0, boolean z) [...]

    // 检测为 Lambda 实现
    public static void d(c c0) [...]

    // 检测为 Lambda 实现
    public static D2.b e(a2.e e0) [...]

    private Task f() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.h(new com.google.firebase.installations.e(this.d, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.h(new f(taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    @Override  // C2.e
    public Task getId() {
        this.z();
        String s = this.n();
        if(s != null) {
            return Tasks.forResult(s);
        }
        Task task0 = this.g();
        C2.b b0 = () -> this.w();
        this.h.execute(b0);
        return task0;
    }

    private void h(h h0) {
        synchronized(this.g) {
            this.l.add(h0);
        }
    }

    private void i(boolean z) {
        d d2;
        d d0 = this.r();
        try {
            if(d0.i() || d0.l()) {
                d2 = this.B(d0);
            }
            else {
                if(!z && !this.d.f(d0)) {
                    return;
                }
                d2 = this.k(d0);
            }
        }
        catch(com.google.firebase.installations.d d1) {
            this.C(d1);
            return;
        }
        this.u(d2);
        this.F(d0, d2);
        if(d2.k()) {
            this.E(d2.d());
        }
        if(d2.i()) {
            this.C(new com.google.firebase.installations.d(com.google.firebase.installations.d.a.f));
            return;
        }
        if(d2.j()) {
            this.C(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            return;
        }
        this.D(d2);
    }

    private final void j(boolean z) {
        d d0 = this.s();
        if(z) {
            d0 = d0.p();
        }
        this.D(d0);
        C2.c c0 = () -> this.v(z);
        this.i.execute(c0);
    }

    private d k(d d0) {
        String s = this.l();
        String s1 = d0.d();
        String s2 = this.t();
        String s3 = d0.f();
        E2.f f0 = this.b.e(s, s1, s2, s3);
        switch(b.b[f0.b().ordinal()]) {
            case 1: {
                return d0.o(f0.c(), f0.d(), this.d.b());
            }
            case 2: {
                return d0.q("BAD CONFIG");
            }
            case 3: {
                this.E(null);
                return d0.r();
            }
            default: {
                throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.d.a.g);
            }
        }
    }

    String l() {
        return this.a.m().b();
    }

    String m() {
        return this.a.m().c();
    }

    private String n() {
        synchronized(this) {
        }
        return this.j;
    }

    private D2.b o() {
        return (D2.b)this.e.get();
    }

    public static c p() {
        return c.q(a2.e.k());
    }

    public static c q(a2.e e0) {
        Preconditions.checkArgument(e0 != null, "Null is not a valid value of FirebaseApp.");
        return (c)e0.i(e.class);
    }

    private d r() {
        d d0;
        synchronized(c.m) {
            com.google.firebase.installations.b b0 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
            try {
                d0 = this.c.d();
            }
            catch(Throwable throwable0) {
                if(b0 != null) {
                    b0.b();
                }
                throw throwable0;
            }
            if(b0 != null) {
                b0.b();
            }
            return d0;
        }
    }

    private d s() {
        synchronized(c.m) {
            com.google.firebase.installations.b b0 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
            try {
                d d0 = this.c.d();
                if(d0.j()) {
                    d d1 = d0.t(this.A(d0));
                    d0 = this.c.b(d1);
                }
                return d0;
            }
            finally {
                if(b0 != null) {
                    b0.b();
                }
            }
        }
    }

    String t() {
        return this.a.m().e();
    }

    private void u(d d0) {
        synchronized(c.m) {
            com.google.firebase.installations.b b0 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
            try {
                this.c.b(d0);
            }
            catch(Throwable throwable0) {
                if(b0 != null) {
                    b0.b();
                }
                throw throwable0;
            }
            if(b0 != null) {
                b0.b();
            }
        }
    }

    private void v(boolean z) {
        this.i(z);
    }

    private void w() {
        this.j(false);
    }

    private void x(boolean z) {
        this.j(z);
    }

    private static D2.b y(a2.e e0) {
        return new D2.b(e0);
    }

    private void z() {
        Preconditions.checkNotEmpty(this.m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.h(this.m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.g(this.l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
}

