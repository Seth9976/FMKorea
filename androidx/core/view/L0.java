package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class l0 {
    public static final class a {
        private final e a;
        private final e b;

        private a(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            this.a = d.g(windowInsetsAnimation$Bounds0);
            this.b = d.f(windowInsetsAnimation$Bounds0);
        }

        public a(e e0, e e1) {
            this.a = e0;
            this.b = e1;
        }

        public e a() {
            return this.a;
        }

        public e b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public static a d(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return new a(windowInsetsAnimation$Bounds0);
        }

        @Override
        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }
    }

    public static abstract class b {
        WindowInsets a;
        private final int b;

        public b(int v) {
            this.b = v;
        }

        public final int a() {
            return this.b;
        }

        public abstract void b(l0 arg1);

        public abstract void c(l0 arg1);

        public abstract y0 d(y0 arg1, List arg2);

        public abstract a e(l0 arg1, a arg2);
    }

    static class c extends androidx.core.view.l0.e {
        static class androidx.core.view.l0.c.a implements View.OnApplyWindowInsetsListener {
            final b a;
            private y0 b;

            androidx.core.view.l0.c.a(View view0, b l0$b0) {
                this.a = l0$b0;
                y0 y00 = Y.G(view0);
                this.b = y00 == null ? null : new androidx.core.view.y0.b(y00).a();
            }

            @Override  // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                class androidx.core.view.l0.c.a.a implements ValueAnimator.AnimatorUpdateListener {
                    final l0 a;
                    final y0 b;
                    final y0 c;
                    final int d;
                    final View e;
                    final androidx.core.view.l0.c.a f;

                    androidx.core.view.l0.c.a.a(l0 l00, y0 y00, y0 y01, int v, View view0) {
                        this.a = l00;
                        this.b = y00;
                        this.c = y01;
                        this.d = v;
                        this.e = view0;
                        super();
                    }

                    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                        float f = valueAnimator0.getAnimatedFraction();
                        this.a.e(f);
                        float f1 = this.a.b();
                        y0 y00 = c.o(this.b, this.c, f1, this.d);
                        List list0 = Collections.singletonList(this.a);
                        c.k(this.e, y00, list0);
                    }
                }


                class androidx.core.view.l0.c.a.b extends AnimatorListenerAdapter {
                    final l0 a;
                    final View b;
                    final androidx.core.view.l0.c.a c;

                    androidx.core.view.l0.c.a.b(l0 l00, View view0) {
                        this.a = l00;
                        this.b = view0;
                        super();
                    }

                    @Override  // android.animation.AnimatorListenerAdapter
                    public void onAnimationEnd(Animator animator0) {
                        this.a.e(1.0f);
                        c.i(this.b, this.a);
                    }
                }


                class androidx.core.view.l0.c.a.c implements Runnable {
                    final View f;
                    final l0 g;
                    final a h;
                    final ValueAnimator i;
                    final androidx.core.view.l0.c.a j;

                    androidx.core.view.l0.c.a.c(View view0, l0 l00, a l0$a0, ValueAnimator valueAnimator0) {
                        this.f = view0;
                        this.g = l00;
                        this.h = l0$a0;
                        this.i = valueAnimator0;
                        super();
                    }

                    @Override
                    public void run() {
                        c.l(this.f, this.g, this.h);
                        this.i.start();
                    }
                }

                if(!view0.isLaidOut()) {
                    this.b = y0.y(windowInsets0, view0);
                    return c.m(view0, windowInsets0);
                }
                y0 y00 = y0.y(windowInsets0, view0);
                if(this.b == null) {
                    this.b = Y.G(view0);
                }
                if(this.b == null) {
                    this.b = y00;
                    return c.m(view0, windowInsets0);
                }
                b l0$b0 = c.n(view0);
                if(l0$b0 != null && Objects.equals(l0$b0.a, windowInsets0)) {
                    return c.m(view0, windowInsets0);
                }
                int v = c.e(y00, this.b);
                if(v == 0) {
                    return c.m(view0, windowInsets0);
                }
                y0 y01 = this.b;
                l0 l00 = new l0(v, c.g(v, y00, y01), 0xA0L);
                l00.e(0.0f);
                ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(l00.a());
                a l0$a0 = c.f(y00, y01, v);
                c.j(view0, l00, windowInsets0, false);
                valueAnimator0.addUpdateListener(new androidx.core.view.l0.c.a.a(this, l00, y00, y01, v, view0));
                valueAnimator0.addListener(new androidx.core.view.l0.c.a.b(this, l00, view0));
                J.a(view0, new androidx.core.view.l0.c.a.c(this, view0, l00, l0$a0, valueAnimator0));
                this.b = y00;
                return c.m(view0, windowInsets0);
            }
        }

        private static final Interpolator e;
        private static final Interpolator f;
        private static final Interpolator g;

        static {
            c.e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
            c.f = new T.a();
            c.g = new DecelerateInterpolator();
        }

        c(int v, Interpolator interpolator0, long v1) {
            super(v, interpolator0, v1);
        }

        static int e(y0 y00, y0 y01) {
            int v = 0;
            for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
                if(!y00.f(v1).equals(y01.f(v1))) {
                    v |= v1;
                }
            }
            return v;
        }

        static a f(y0 y00, y0 y01, int v) {
            e e0 = y00.f(v);
            e e1 = y01.f(v);
            return new a(e.b(Math.min(e0.a, e1.a), Math.min(e0.b, e1.b), Math.min(e0.c, e1.c), Math.min(e0.d, e1.d)), e.b(Math.max(e0.a, e1.a), Math.max(e0.b, e1.b), Math.max(e0.c, e1.c), Math.max(e0.d, e1.d)));
        }

        static Interpolator g(int v, y0 y00, y0 y01) {
            if((v & 8) != 0) {
                e e0 = y00.f(8);
                e e1 = y01.f(8);
                return e0.d <= e1.d ? c.f : c.e;
            }
            return c.g;
        }

        private static View.OnApplyWindowInsetsListener h(View view0, b l0$b0) {
            return new androidx.core.view.l0.c.a(view0, l0$b0);
        }

        static void i(View view0, l0 l00) {
            b l0$b0 = c.n(view0);
            if(l0$b0 != null) {
                l0$b0.b(l00);
                if(l0$b0.a() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    c.i(((ViewGroup)view0).getChildAt(v), l00);
                }
            }
        }

        static void j(View view0, l0 l00, WindowInsets windowInsets0, boolean z) {
            b l0$b0 = c.n(view0);
            if(l0$b0 != null) {
                l0$b0.a = windowInsets0;
                if(!z) {
                    l0$b0.c(l00);
                    z = l0$b0.a() == 0;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    c.j(((ViewGroup)view0).getChildAt(v), l00, windowInsets0, z);
                }
            }
        }

        static void k(View view0, y0 y00, List list0) {
            b l0$b0 = c.n(view0);
            if(l0$b0 != null) {
                y00 = l0$b0.d(y00, list0);
                if(l0$b0.a() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    c.k(((ViewGroup)view0).getChildAt(v), y00, list0);
                }
            }
        }

        static void l(View view0, l0 l00, a l0$a0) {
            b l0$b0 = c.n(view0);
            if(l0$b0 != null) {
                l0$b0.e(l00, l0$a0);
                if(l0$b0.a() == 0) {
                    return;
                }
            }
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    c.l(((ViewGroup)view0).getChildAt(v), l00, l0$a0);
                }
            }
        }

        static WindowInsets m(View view0, WindowInsets windowInsets0) {
            return view0.getTag(v.c.L) == null ? view0.onApplyWindowInsets(windowInsets0) : windowInsets0;
        }

        static b n(View view0) {
            Object object0 = view0.getTag(v.c.S);
            return object0 instanceof androidx.core.view.l0.c.a ? ((androidx.core.view.l0.c.a)object0).a : null;
        }

        static y0 o(y0 y00, y0 y01, float f, int v) {
            androidx.core.view.y0.b y0$b0 = new androidx.core.view.y0.b(y00);
            for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
                if((v & v1) == 0) {
                    y0$b0.b(v1, y00.f(v1));
                }
                else {
                    e e0 = y00.f(v1);
                    e e1 = y01.f(v1);
                    y0$b0.b(v1, y0.p(e0, ((int)(((double)(((float)(e0.a - e1.a)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(e0.b - e1.b)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(e0.c - e1.c)) * (1.0f - f))) + 0.5)), ((int)(((double)(((float)(e0.d - e1.d)) * (1.0f - f))) + 0.5))));
                }
            }
            return y0$b0.a();
        }

        static void p(View view0, b l0$b0) {
            Object object0 = view0.getTag(v.c.L);
            if(l0$b0 == null) {
                view0.setTag(v.c.S, null);
                if(object0 == null) {
                    view0.setOnApplyWindowInsetsListener(null);
                }
            }
            else {
                View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = c.h(view0, l0$b0);
                view0.setTag(v.c.S, view$OnApplyWindowInsetsListener0);
                if(object0 == null) {
                    view0.setOnApplyWindowInsetsListener(view$OnApplyWindowInsetsListener0);
                }
            }
        }
    }

    static class d extends androidx.core.view.l0.e {
        static class androidx.core.view.l0.d.a extends WindowInsetsAnimation.Callback {
            private final b a;
            private List b;
            private ArrayList c;
            private final HashMap d;

            androidx.core.view.l0.d.a(b l0$b0) {
                super(l0$b0.a());
                this.d = new HashMap();
                this.a = l0$b0;
            }

            private l0 a(WindowInsetsAnimation windowInsetsAnimation0) {
                l0 l00 = (l0)this.d.get(windowInsetsAnimation0);
                if(l00 == null) {
                    l00 = l0.f(windowInsetsAnimation0);
                    this.d.put(windowInsetsAnimation0, l00);
                }
                return l00;
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation0) {
                l0 l00 = this.a(windowInsetsAnimation0);
                this.a.b(l00);
                this.d.remove(windowInsetsAnimation0);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation0) {
                l0 l00 = this.a(windowInsetsAnimation0);
                this.a.c(l00);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public WindowInsets onProgress(WindowInsets windowInsets0, List list0) {
                ArrayList arrayList0 = this.c;
                if(arrayList0 == null) {
                    ArrayList arrayList1 = new ArrayList(list0.size());
                    this.c = arrayList1;
                    this.b = Collections.unmodifiableList(arrayList1);
                }
                else {
                    arrayList0.clear();
                }
                for(int v = list0.size() - 1; v >= 0; --v) {
                    WindowInsetsAnimation windowInsetsAnimation0 = w0.a(list0.get(v));
                    l0 l00 = this.a(windowInsetsAnimation0);
                    l00.e(windowInsetsAnimation0.getFraction());
                    this.c.add(l00);
                }
                y0 y00 = y0.x(windowInsets0);
                return this.a.d(y00, this.b).w();
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation0, WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
                l0 l00 = this.a(windowInsetsAnimation0);
                a l0$a0 = a.d(windowInsetsAnimation$Bounds0);
                return this.a.e(l00, l0$a0).c();
            }
        }

        private final WindowInsetsAnimation e;

        d(int v, Interpolator interpolator0, long v1) {
            this(r0.a(v, interpolator0, v1));
        }

        d(WindowInsetsAnimation windowInsetsAnimation0) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation0;
        }

        @Override  // androidx.core.view.l0$e
        public long a() {
            return this.e.getDurationMillis();
        }

        @Override  // androidx.core.view.l0$e
        public float b() {
            return this.e.getInterpolatedFraction();
        }

        @Override  // androidx.core.view.l0$e
        public int c() {
            return this.e.getTypeMask();
        }

        @Override  // androidx.core.view.l0$e
        public void d(float f) {
            this.e.setFraction(f);
        }

        public static WindowInsetsAnimation.Bounds e(a l0$a0) {
            return s0.a(l0$a0.a().e(), l0$a0.b().e());
        }

        public static e f(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return e.d(windowInsetsAnimation$Bounds0.getUpperBound());
        }

        public static e g(WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
            return e.d(windowInsetsAnimation$Bounds0.getLowerBound());
        }

        public static void h(View view0, b l0$b0) {
            view0.setWindowInsetsAnimationCallback((l0$b0 == null ? null : new androidx.core.view.l0.d.a(l0$b0)));
        }
    }

    static abstract class androidx.core.view.l0.e {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;

        androidx.core.view.l0.e(int v, Interpolator interpolator0, long v1) {
            this.a = v;
            this.c = interpolator0;
            this.d = v1;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            return this.c == null ? this.b : this.c.getInterpolation(this.b);
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    private androidx.core.view.l0.e a;

    public l0(int v, Interpolator interpolator0, long v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new d(v, interpolator0, v1);
            return;
        }
        this.a = new c(v, interpolator0, v1);
    }

    private l0(WindowInsetsAnimation windowInsetsAnimation0) {
        this(0, null, 0L);
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation0);
        }
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    static void d(View view0, b l0$b0) {
        if(Build.VERSION.SDK_INT >= 30) {
            d.h(view0, l0$b0);
            return;
        }
        c.p(view0, l0$b0);
    }

    public void e(float f) {
        this.a.d(f);
    }

    static l0 f(WindowInsetsAnimation windowInsetsAnimation0) {
        return new l0(windowInsetsAnimation0);
    }
}

