package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k0.h;
import l3.u;
import y3.l;
import z3.g;
import z3.k;

public final class c {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    public h a;
    private final Handler b;
    private Runnable c;
    private final Object d;
    private long e;
    private final Executor f;
    private int g;
    private long h;
    private k0.g i;
    private boolean j;
    private final Runnable k;
    private final Runnable l;
    public static final a m;

    static {
        c.m = new a(null);
    }

    public c(long v, TimeUnit timeUnit0, Executor executor0) {
        k.e(timeUnit0, "autoCloseTimeUnit");
        k.e(executor0, "autoCloseExecutor");
        super();
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit0.toMillis(v);
        this.f = executor0;
        this.h = SystemClock.uptimeMillis();
        this.k = () -> c.f(this);
        this.l = () -> c.c(this);
    }

    // 检测为 Lambda 实现
    public static void a(c c0) [...]

    // 检测为 Lambda 实现
    public static void b(c c0) [...]

    private static final void c(c c0) {
        u u0;
        k.e(c0, "this$0");
        synchronized(c0.d) {
            if(SystemClock.uptimeMillis() - c0.h < c0.e) {
                return;
            }
            goto label_6;
        }
        return;
    label_6:
        if(c0.g != 0) {
            return;
        }
        Runnable runnable0 = c0.c;
        if(runnable0 == null) {
            u0 = null;
        }
        else {
            runnable0.run();
            u0 = u.a;
        }
        if(u0 == null) {
            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        }
        k0.g g0 = c0.i;
        if(g0 != null && g0.h()) {
            g0.close();
        }
        c0.i = null;
    }

    public final void d() {
        synchronized(this.d) {
            this.j = true;
            k0.g g0 = this.i;
            if(g0 != null) {
                g0.close();
            }
            this.i = null;
        }
    }

    public final void e() {
        int v;
        synchronized(this.d) {
            v = this.g;
            if(v <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we\'re supposed to decrement");
            }
        }
        this.g = v - 1;
        if(v - 1 == 0) {
            if(this.i == null) {
                return;
            }
            try {
                this.b.postDelayed(this.k, this.e);
                return;
            }
            catch(Throwable throwable0) {
            }
            throw throwable0;
        }
    }

    private static final void f(c c0) {
        k.e(c0, "this$0");
        c0.f.execute(c0.l);
    }

    public final Object g(l l0) {
        k.e(l0, "block");
        try {
            return l0.h(this.j());
        }
        finally {
            this.e();
        }
    }

    public final k0.g h() {
        return this.i;
    }

    public final h i() {
        h h0 = this.a;
        if(h0 != null) {
            return h0;
        }
        k.p("delegateOpenHelper");
        return null;
    }

    public final k0.g j() {
        synchronized(this.d) {
            this.b.removeCallbacks(this.k);
            ++this.g;
            if(!this.j) {
                k0.g g0 = this.i;
                if(g0 != null && g0.h()) {
                    return g0;
                }
                k0.g g1 = this.i().G();
                this.i = g1;
                return g1;
            }
        }
        throw new IllegalStateException("Attempting to open already closed database.");
    }

    public final void k(h h0) {
        k.e(h0, "delegateOpenHelper");
        this.n(h0);
    }

    public final boolean l() {
        return !this.j;
    }

    public final void m(Runnable runnable0) {
        k.e(runnable0, "onAutoClose");
        this.c = runnable0;
    }

    public final void n(h h0) {
        k.e(h0, "<set-?>");
        this.a = h0;
    }
}

