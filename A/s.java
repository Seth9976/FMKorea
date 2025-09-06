package A;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import l3.h;
import l3.i;
import z3.k;
import z3.l;

public final class s {
    static class a {
        private final Activity a;
        private final h b;

        public a(Activity activity0) {
            static final class A.s.a.a extends l implements y3.a {
                final a g;

                A.s.a.a(a s$a0) {
                    this.g = s$a0;
                    super(0);
                }

                @Override  // y3.a
                public Object a() {
                    return this.b();
                }

                public final ViewGroup b() {
                    View view0 = View.inflate(this.g.b(), f.a, null);
                    if(view0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    return (ViewGroup)view0;
                }
            }

            k.e(activity0, "activity");
            super();
            this.a = activity0;
            this.b = i.a(new A.s.a.a(this));
        }

        public void a() {
            View view0 = ((ViewGroup)this.a.findViewById(0x1020002)).getRootView();
            ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
            if(viewGroup0 != null) {
                viewGroup0.addView(this.d());
            }
        }

        public final Activity b() {
            return this.a;
        }

        public ViewGroup c() {
            return this.d();
        }

        private final ViewGroup d() {
            return (ViewGroup)this.b.getValue();
        }

        public void e() {
            ViewParent viewParent0 = this.c().getParent();
            ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
            if(viewGroup0 != null) {
                viewGroup0.removeView(this.c());
            }
        }
    }

    static final class b extends a {
        public SplashScreenView c;

        public b(Activity activity0) {
            k.e(activity0, "activity");
            super(activity0);
        }

        @Override  // A.s$a
        public void a() {
        }

        @Override  // A.s$a
        public ViewGroup c() {
            return this.g();
        }

        @Override  // A.s$a
        public void e() {
            this.f().remove();
            Resources.Theme resources$Theme0 = this.b().getTheme();
            k.d(resources$Theme0, "activity.theme");
            View view0 = this.b().getWindow().getDecorView();
            k.d(view0, "activity.window.decorView");
            w.c(resources$Theme0, view0, null, 4, null);
        }

        public final SplashScreenView f() {
            SplashScreenView splashScreenView0 = this.c;
            if(splashScreenView0 != null) {
                return splashScreenView0;
            }
            k.p("platformView");
            return null;
        }

        public SplashScreenView g() {
            return this.f();
        }

        public final void h(SplashScreenView splashScreenView0) {
            k.e(splashScreenView0, "<set-?>");
            this.c = splashScreenView0;
        }
    }

    private final a a;

    public s(Activity activity0) {
        k.e(activity0, "ctx");
        super();
        a s$a0 = Build.VERSION.SDK_INT >= 0x1F ? new b(activity0) : new a(activity0);
        s$a0.a();
        this.a = s$a0;
    }

    public s(SplashScreenView splashScreenView0, Activity activity0) {
        k.e(splashScreenView0, "platformView");
        k.e(activity0, "ctx");
        this(activity0);
        ((b)this.a).h(splashScreenView0);
    }

    public final View a() {
        return this.a.c();
    }

    public final void b() {
        this.a.e();
    }
}

