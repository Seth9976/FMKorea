package A;

import android.app.Activity;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import z3.k;

public final class g {
    public static final class a {
        private a() {
        }

        public a(z3.g g0) {
        }

        public final g a(Activity activity0) {
            k.e(activity0, "<this>");
            g g0 = new g(activity0, null);
            g0.b();
            return g0;
        }
    }

    static class b {
        private final Activity a;
        private int b;
        private Integer c;
        private Integer d;
        private Drawable e;
        private boolean f;
        private d g;
        private e h;
        private s i;

        public b(Activity activity0) {
            k.e(activity0, "activity");
            super();
            this.a = activity0;
            this.g = new h();
        }

        public static boolean a() [...] // 潜在的解密器

        public final void e(s s0) {
            k.e(s0, "splashScreenViewProvider");
            e g$e0 = this.h;
            if(g$e0 == null) {
                return;
            }
            this.h = null;
            s0.a().postOnAnimation(() -> {
                k.e(s0, "$splashScreenViewProvider");
                k.e(g$e0, "$finalListener");
                s0.a().bringToFront();
                g$e0.a(s0);
            });
        }

        // 检测为 Lambda 实现
        private static final void f(s s0, e g$e0) [...]

        private final void g(View view0, Drawable drawable0) {
            float f;
            ImageView imageView0 = (ImageView)view0.findViewById(A.e.a);
            if(this.f) {
                Drawable drawable1 = imageView0.getContext().getDrawable(A.d.a);
                f = imageView0.getResources().getDimension(c.b) * 0.666667f;
                if(drawable1 != null) {
                    imageView0.setBackground(new A.a(drawable1, f));
                }
            }
            else {
                f = imageView0.getResources().getDimension(c.a) * 0.666667f;
            }
            imageView0.setImageDrawable(new A.a(drawable0, f));
        }

        public final Activity h() {
            return this.a;
        }

        public final d i() {
            return this.g;
        }

        public void j() {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = this.a.getTheme();
            boolean z = true;
            if(resources$Theme0.resolveAttribute(A.b.d, typedValue0, true)) {
                this.c = typedValue0.resourceId;
                this.d = typedValue0.data;
            }
            if(resources$Theme0.resolveAttribute(A.b.c, typedValue0, true)) {
                this.e = resources$Theme0.getDrawable(typedValue0.resourceId);
            }
            if(resources$Theme0.resolveAttribute(A.b.b, typedValue0, true)) {
                if(typedValue0.resourceId != c.b) {
                    z = false;
                }
                this.f = z;
            }
            k.d(resources$Theme0, "currentTheme");
            this.m(resources$Theme0, typedValue0);
        }

        public void k(d g$d0) {
            public static final class A.g.b.a implements ViewTreeObserver.OnPreDrawListener {
                final b f;
                final View g;

                A.g.b.a(b g$b0, View view0) {
                    this.f = g$b0;
                    this.g = view0;
                    super();
                }

                @Override  // android.view.ViewTreeObserver$OnPreDrawListener
                public boolean onPreDraw() {
                    if(this.f.i().a()) {
                        return false;
                    }
                    this.g.getViewTreeObserver().removeOnPreDrawListener(this);
                    s s0 = this.f.i;
                    if(s0 != null) {
                        this.f.e(s0);
                    }
                    return true;
                }
            }

            k.e(g$d0, "keepOnScreenCondition");
            this.g = g$d0;
            View view0 = this.a.findViewById(0x1020002);
            view0.getViewTreeObserver().addOnPreDrawListener(new A.g.b.a(this, view0));
        }

        public void l(e g$e0) {
            public static final class A.g.b.b implements View.OnLayoutChangeListener {
                final b a;
                final s b;

                A.g.b.b(b g$b0, s s0) {
                    this.a = g$b0;
                    this.b = s0;
                    super();
                }

                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    k.e(view0, "view");
                    if(!view0.isAttachedToWindow()) {
                        return;
                    }
                    view0.removeOnLayoutChangeListener(this);
                    if(!this.a.i().a()) {
                        this.a.e(this.b);
                        return;
                    }
                    this.a.i = this.b;
                }
            }

            k.e(g$e0, "exitAnimationListener");
            this.h = g$e0;
            s s0 = new s(this.a);
            Integer integer0 = this.c;
            Integer integer1 = this.d;
            View view0 = s0.a();
            if(integer0 != null && ((int)integer0) != 0) {
                view0.setBackgroundResource(((int)integer0));
            }
            else if(integer1 == null) {
                view0.setBackground(this.a.getWindow().getDecorView().getBackground());
            }
            else {
                view0.setBackgroundColor(((int)integer1));
            }
            Drawable drawable0 = this.e;
            if(drawable0 != null) {
                this.g(view0, drawable0);
            }
            view0.addOnLayoutChangeListener(new A.g.b.b(this, s0));
        }

        protected final void m(Resources.Theme resources$Theme0, TypedValue typedValue0) {
            k.e(resources$Theme0, "currentTheme");
            k.e(typedValue0, "typedValue");
            if(resources$Theme0.resolveAttribute(A.b.a, typedValue0, true)) {
                int v = typedValue0.resourceId;
                this.b = v;
                if(v != 0) {
                    this.a.setTheme(v);
                }
            }
        }

        public final void n(d g$d0) {
            k.e(g$d0, "<set-?>");
            this.g = g$d0;
        }

        private static final boolean o() [...] // Inlined contents
    }

    static final class A.g.c extends b {
        private ViewTreeObserver.OnPreDrawListener j;
        private boolean k;
        private final ViewGroup.OnHierarchyChangeListener l;

        public A.g.c(Activity activity0) {
            public static final class A.g.c.a implements ViewGroup.OnHierarchyChangeListener {
                final A.g.c f;
                final Activity g;

                A.g.c.a(A.g.c g$c0, Activity activity0) {
                    this.f = g$c0;
                    this.g = activity0;
                    super();
                }

                @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                public void onChildViewAdded(View view0, View view1) {
                    if(q.a(view1)) {
                        boolean z = this.f.r(((SplashScreenView)view1));
                        this.f.s(z);
                        ((ViewGroup)this.g.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    }
                }

                @Override  // android.view.ViewGroup$OnHierarchyChangeListener
                public void onChildViewRemoved(View view0, View view1) {
                }
            }

            k.e(activity0, "activity");
            super(activity0);
            this.k = true;
            this.l = new A.g.c.a(this, activity0);
        }

        @Override  // A.g$b
        public void j() {
            Resources.Theme resources$Theme0 = this.h().getTheme();
            k.d(resources$Theme0, "activity.theme");
            this.m(resources$Theme0, new TypedValue());
            ((ViewGroup)this.h().getWindow().getDecorView()).setOnHierarchyChangeListener(this.l);
        }

        @Override  // A.g$b
        public void k(d g$d0) {
            public static final class A.g.c.b implements ViewTreeObserver.OnPreDrawListener {
                final A.g.c f;
                final View g;

                A.g.c.b(A.g.c g$c0, View view0) {
                    this.f = g$c0;
                    this.g = view0;
                    super();
                }

                @Override  // android.view.ViewTreeObserver$OnPreDrawListener
                public boolean onPreDraw() {
                    if(this.f.i().a()) {
                        return false;
                    }
                    this.g.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            }

            k.e(g$d0, "keepOnScreenCondition");
            this.n(g$d0);
            View view0 = this.h().findViewById(0x1020002);
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(this.j != null && viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnPreDrawListener(this.j);
            }
            A.g.c.b g$c$b0 = new A.g.c.b(this, view0);
            this.j = g$c$b0;
            viewTreeObserver0.addOnPreDrawListener(g$c$b0);
        }

        @Override  // A.g$b
        public void l(e g$e0) {
            k.e(g$e0, "exitAnimationListener");
            this.h().getSplashScreen().setOnExitAnimationListener((SplashScreenView splashScreenView0) -> {
                k.e(this, "this$0");
                k.e(g$e0, "$exitAnimationListener");
                k.e(splashScreenView0, "splashScreenView");
                this.q();
                g$e0.a(new s(splashScreenView0, this.h()));
            });
        }

        private final void q() {
            TypedValue typedValue0 = new TypedValue();
            Resources.Theme resources$Theme0 = this.h().getTheme();
            Window window0 = this.h().getWindow();
            boolean z = true;
            if(resources$Theme0.resolveAttribute(0x1010451, typedValue0, true)) {
                window0.setStatusBarColor(typedValue0.data);
            }
            if(resources$Theme0.resolveAttribute(0x1010452, typedValue0, true)) {
                window0.setNavigationBarColor(typedValue0.data);
            }
            if(resources$Theme0.resolveAttribute(0x1010450, typedValue0, true)) {
                if(typedValue0.data == 0) {
                    window0.clearFlags(0x80000000);
                }
                else {
                    window0.addFlags(0x80000000);
                }
            }
            if(resources$Theme0.resolveAttribute(0x1010605, typedValue0, true)) {
                window0.setNavigationBarContrastEnforced(typedValue0.data != 0);
            }
            if(resources$Theme0.resolveAttribute(0x1010604, typedValue0, true)) {
                if(typedValue0.data == 0) {
                    z = false;
                }
                window0.setStatusBarContrastEnforced(z);
            }
            ViewGroup viewGroup0 = (ViewGroup)window0.getDecorView();
            k.d(resources$Theme0, "theme");
            w.b(resources$Theme0, viewGroup0, typedValue0);
            viewGroup0.setOnHierarchyChangeListener(null);
            window0.setDecorFitsSystemWindows(this.k);
        }

        public final boolean r(SplashScreenView splashScreenView0) {
            k.e(splashScreenView0, "child");
            WindowInsets windowInsets0 = j.a().build();
            k.d(windowInsets0, "Builder().build()");
            Rect rect0 = new Rect(0x80000000, 0x80000000, 0x7FFFFFFF, 0x7FFFFFFF);
            return windowInsets0 != splashScreenView0.getRootView().computeSystemWindowInsets(windowInsets0, rect0) || !rect0.isEmpty();
        }

        public final void s(boolean z) {
            this.k = z;
        }

        // 检测为 Lambda 实现
        private static final void t(A.g.c g$c0, e g$e0, SplashScreenView splashScreenView0) [...]
    }

    public interface d {
        boolean a();
    }

    public interface e {
        void a(s arg1);
    }

    private final b a;
    public static final a b;

    static {
        g.b = new a(null);
    }

    private g(Activity activity0) {
        b g$b0 = Build.VERSION.SDK_INT >= 0x1F ? new A.g.c(activity0) : new b(activity0);
        this.a = g$b0;
    }

    public g(Activity activity0, z3.g g0) {
        this(activity0);
    }

    private final void b() {
        this.a.j();
    }

    public static final g c(Activity activity0) {
        return g.b.a(activity0);
    }

    public final void d(d g$d0) {
        k.e(g$d0, "condition");
        this.a.k(g$d0);
    }

    public final void e(e g$e0) {
        k.e(g$e0, "listener");
        this.a.l(g$e0);
    }
}

