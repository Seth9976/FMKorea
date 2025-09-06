package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import z3.g;
import z3.k;

public final class w implements n {
    public static final class a {
        public static final a a;

        static {
            a.a = new a();
        }

        public static final void a(Activity activity0, Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
            k.e(activity0, "activity");
            k.e(application$ActivityLifecycleCallbacks0, "callback");
            activity0.registerActivityLifecycleCallbacks(application$ActivityLifecycleCallbacks0);
        }
    }

    public static final class b {
        private b() {
        }

        public b(g g0) {
        }

        public final n a() {
            return w.o;
        }

        public final void b(Context context0) {
            k.e(context0, "context");
            w.o.i(context0);
        }
    }

    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private Handler j;
    private final o k;
    private final Runnable l;
    private final androidx.lifecycle.x.a m;
    public static final b n;
    private static final w o;

    static {
        w.n = new b(null);
        w.o = new w();
    }

    private w() {
        public static final class d implements androidx.lifecycle.x.a {
            final w a;

            d(w w0) {
                this.a = w0;
                super();
            }

            @Override  // androidx.lifecycle.x$a
            public void onCreate() {
            }

            @Override  // androidx.lifecycle.x$a
            public void onResume() {
                this.a.e();
            }

            @Override  // androidx.lifecycle.x$a
            public void onStart() {
                this.a.g();
            }
        }

        this.h = true;
        this.i = true;
        this.k = new o(this);
        this.l = () -> {
            k.e(this, "this$0");
            this.k();
            this.l();
        };
        this.m = new d(this);
    }

    public final void d() {
        int v = this.g - 1;
        this.g = v;
        if(v == 0) {
            Handler handler0 = this.j;
            k.b(handler0);
            handler0.postDelayed(this.l, 700L);
        }
    }

    public final void e() {
        int v = this.g + 1;
        this.g = v;
        if(v == 1) {
            if(this.h) {
                this.k.h(androidx.lifecycle.h.a.ON_RESUME);
                this.h = false;
                return;
            }
            Handler handler0 = this.j;
            k.b(handler0);
            handler0.removeCallbacks(this.l);
        }
    }

    public final void g() {
        int v = this.f + 1;
        this.f = v;
        if(v == 1 && this.i) {
            this.k.h(androidx.lifecycle.h.a.ON_START);
            this.i = false;
        }
    }

    @Override  // androidx.lifecycle.n
    public h getLifecycle() {
        return this.k;
    }

    public final void h() {
        --this.f;
        this.l();
    }

    public final void i(Context context0) {
        public static final class c extends e {
            c(w w0) {
                w.this = w0;
                super();
            }

            @Override  // androidx.lifecycle.e
            public void onActivityCreated(Activity activity0, Bundle bundle0) {
                k.e(activity0, "activity");
                if(Build.VERSION.SDK_INT < 29) {
                    x.g.b(activity0).f(w.this.m);
                }
            }

            @Override  // androidx.lifecycle.e
            public void onActivityPaused(Activity activity0) {
                k.e(activity0, "activity");
                w.this.d();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity0, Bundle bundle0) {
                public static final class androidx.lifecycle.w.c.a extends e {
                    androidx.lifecycle.w.c.a(w w0) {
                        w.this = w0;
                        super();
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity0) {
                        k.e(activity0, "activity");
                        w.this.e();
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity0) {
                        k.e(activity0, "activity");
                        w.this.g();
                    }
                }

                k.e(activity0, "activity");
                a.a(activity0, new androidx.lifecycle.w.c.a(w.this));
            }

            @Override  // androidx.lifecycle.e
            public void onActivityStopped(Activity activity0) {
                k.e(activity0, "activity");
                w.this.h();
            }
        }

        k.e(context0, "context");
        this.j = new Handler();
        this.k.h(androidx.lifecycle.h.a.ON_CREATE);
        Context context1 = context0.getApplicationContext();
        k.c(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new c(this));
    }

    // 检测为 Lambda 实现
    private static final void j(w w0) [...]

    public final void k() {
        if(this.g == 0) {
            this.h = true;
            this.k.h(androidx.lifecycle.h.a.ON_PAUSE);
        }
    }

    public final void l() {
        if(this.f == 0 && this.h) {
            this.k.h(androidx.lifecycle.h.a.ON_STOP);
            this.i = true;
        }
    }
}

