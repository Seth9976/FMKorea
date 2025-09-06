package j2;

import a2.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h2.a;
import i2.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o2.f;
import q2.i;

public class o {
    private final Context a;
    private final e b;
    private final u c;
    private final D d;
    private final long e;
    private p f;
    private p g;
    private boolean h;
    private m i;
    private final y j;
    private final f k;
    public final b l;
    private final a m;
    private final ExecutorService n;
    private final k o;
    private final j p;
    private final g2.a q;

    public o(e e0, y y0, g2.a a0, u u0, b b0, a a1, f f0, ExecutorService executorService0, j j0) {
        this.b = e0;
        this.c = u0;
        this.a = e0.j();
        this.j = y0;
        this.q = a0;
        this.l = b0;
        this.m = a1;
        this.n = executorService0;
        this.k = f0;
        this.o = new k(executorService0);
        this.p = j0;
        this.e = System.currentTimeMillis();
        this.d = new D();
    }

    private void d() {
        class d implements Callable {
            final o a;

            public Boolean a() {
                return Boolean.valueOf(o.this.i.s());
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        Boolean boolean0;
        d o$d0 = new d(this);
        Task task0 = this.o.h(o$d0);
        try {
            boolean0 = (Boolean)V.f(task0);
        }
        catch(Exception unused_ex) {
            this.h = false;
            return;
        }
        this.h = Boolean.TRUE.equals(boolean0);
    }

    boolean e() {
        return this.f.c();
    }

    private Task f(i i0) {
        this.n();
        try {
            n n0 = (String s) -> this.i.Z(System.currentTimeMillis() - this.e, s);
            this.l.a(n0);
            this.i.S();
            if(i0.b().b.a) {
                if(!this.i.z(i0)) {
                    g2.f.f().k("Previous sessions could not be finalized.");
                }
                return this.i.V(i0.a());
            }
            g2.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
            return Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
        }
        catch(Exception exception0) {
            g2.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", exception0);
            return Tasks.forException(exception0);
        }
        finally {
            this.m();
        }
    }

    public Task g(i i0) {
        class j2.o.a implements Callable {
            final i a;
            final o b;

            j2.o.a(i i0) {
                this.a = i0;
                super();
            }

            public Task a() {
                return o.this.f(this.a);
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        j2.o.a o$a0 = new j2.o.a(this, i0);
        return V.h(this.n, o$a0);
    }

    private void h(i i0) {
        class j2.o.b implements Runnable {
            final i f;
            final o g;

            j2.o.b(i i0) {
                this.f = i0;
                super();
            }

            @Override
            public void run() {
                o.this.f(this.f);
            }
        }

        j2.o.b o$b0 = new j2.o.b(this, i0);
        Future future0 = this.n.submit(o$b0);
        g2.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            future0.get(3L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            g2.f.f().e("Crashlytics was interrupted during initialization.", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            g2.f.f().e("Crashlytics encountered a problem during initialization.", executionException0);
        }
        catch(TimeoutException timeoutException0) {
            g2.f.f().e("Crashlytics timed out during initialization.", timeoutException0);
        }
    }

    public static String i() [...] // Inlined contents

    static boolean j(String s, boolean z) {
        if(!z) {
            g2.f.f().i("Configured not to require a build ID.");
            return true;
        }
        if(!TextUtils.isEmpty(s)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    // 检测为 Lambda 实现
    public void k(String s) [...]

    public void l(Throwable throwable0) {
        this.i.Y(Thread.currentThread(), throwable0);
    }

    void m() {
        class c implements Callable {
            final o a;

            public Boolean a() {
                try {
                    if(!o.this.f.d()) {
                        g2.f.f().k("Initialization marker file was not properly removed.");
                        return false;
                    }
                    return true;
                }
                catch(Exception exception0) {
                }
                g2.f.f().e("Problem encountered deleting Crashlytics initialization marker.", exception0);
                return false;
            }

            @Override
            public Object call() {
                return this.a();
            }
        }

        c o$c0 = new c(this);
        this.o.h(o$c0);
    }

    void n() {
        this.o.b();
        this.f.a();
        g2.f.f().i("Initialization marker file was created.");
    }

    public boolean o(j2.a a0, i i0) {
        boolean z = j2.i.k(this.a, "com.crashlytics.RequireBuildId", true);
        if(!o.j(a0.b, z)) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String s = new h(this.j).toString();
        try {
            this.g = new p("crash_marker", this.k);
            this.f = new p("initialization_marker", this.k);
            k2.i i1 = new k2.i(s, this.k, this.o);
            k2.c c0 = new k2.c(this.k);
            r2.a a1 = new r2.a(0x400, new r2.d[]{new r2.c(10)});
            N n0 = N.g(this.a, this.j, this.k, a0, c0, i1, a1, i0, this.d, this.p);
            this.i = new m(this.a, this.o, this.j, this.c, this.k, this.g, a0, i1, c0, n0, this.q, this.m);
            boolean z1 = this.e();
            this.d();
            this.i.x(s, Thread.getDefaultUncaughtExceptionHandler(), i0);
            if(z1 && j2.i.c(this.a)) {
                g2.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                this.h(i0);
                return false;
            }
        }
        catch(Exception exception0) {
            g2.f.f().e("Crashlytics was not started due to an exception during initialization", exception0);
            this.i = null;
            return false;
        }
        g2.f.f().b("Successfully configured exception handler.");
        return true;
    }

    public void p(Boolean boolean0) {
        this.c.g(boolean0);
    }

    public void q(String s) {
        this.i.U(s);
    }
}

