package com.google.android.material.carousel;

import B.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.n;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.p;
import androidx.recyclerview.widget.RecyclerView.u;
import androidx.recyclerview.widget.RecyclerView.x.b;
import androidx.recyclerview.widget.RecyclerView.y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x.a;
import z1.k;

public class CarouselLayoutManager extends o implements b, com.google.android.material.carousel.b {
    static final class com.google.android.material.carousel.CarouselLayoutManager.b {
        final View a;
        final float b;
        final float c;
        final d d;

        com.google.android.material.carousel.CarouselLayoutManager.b(View view0, float f, float f1, d carouselLayoutManager$d0) {
            this.a = view0;
            this.b = f;
            this.c = f1;
            this.d = carouselLayoutManager$d0;
        }
    }

    static class c extends n {
        private final Paint a;
        private List b;

        c() {
            Paint paint0 = new Paint();
            this.a = paint0;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint0.setStrokeWidth(5.0f);
            paint0.setColor(0xFFFF00FF);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$n
        public void i(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
            super.i(canvas0, recyclerView0, recyclerView$y0);
            float f = recyclerView0.getResources().getDimension(z1.c.v);
            this.a.setStrokeWidth(f);
            for(Object object0: this.b) {
                com.google.android.material.carousel.f.c f$c0 = (com.google.android.material.carousel.f.c)object0;
                int v = androidx.core.graphics.d.c(0xFFFF00FF, 0xFF0000FF, f$c0.c);
                this.a.setColor(v);
                if(((CarouselLayoutManager)recyclerView0.getLayoutManager()).f()) {
                    float f1 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).A2();
                    float f2 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).v2();
                    canvas0.drawLine(f$c0.b, f1, f$c0.b, f2, this.a);
                }
                else {
                    float f3 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).x2();
                    float f4 = (float)((CarouselLayoutManager)recyclerView0.getLayoutManager()).y2();
                    canvas0.drawLine(f3, f$c0.b, f4, f$c0.b, this.a);
                }
            }
        }

        void j(List list0) {
            this.b = Collections.unmodifiableList(list0);
        }
    }

    static class d {
        final com.google.android.material.carousel.f.c a;
        final com.google.android.material.carousel.f.c b;

        d(com.google.android.material.carousel.f.c f$c0, com.google.android.material.carousel.f.c f$c1) {
            h.a(f$c0.a <= f$c1.a);
            this.a = f$c0;
            this.b = f$c1;
        }
    }

    private int A;
    private Map B;
    private com.google.android.material.carousel.c C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;
    int s;
    int t;
    int u;
    private boolean v;
    private final c w;
    private com.google.android.material.carousel.d x;
    private g y;
    private f z;

    public CarouselLayoutManager() {
        this(new com.google.android.material.carousel.h());
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> this.I2(view0, v, v1, v2, v3, v4, v5, v6, v7);
        this.F = -1;
        this.G = 0;
        this.T2(new com.google.android.material.carousel.h());
        this.S2(context0, attributeSet0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d d0) {
        this(d0, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d d0, int v) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> this.I2(view0, v, v1, v2, v3, v4, v5, v6, v7);
        this.F = -1;
        this.G = 0;
        this.T2(d0);
        this.U2(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A(y recyclerView$y0) {
        return this.u - this.t;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int A1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.p() ? this.P2(v, recyclerView$u0, recyclerView$y0) : 0;
    }

    private int A2() {
        return this.C.j();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void B1(int v) {
        this.F = v;
        if(this.y == null) {
            return;
        }
        this.s = this.C2(v, this.q2(v));
        this.A = a.b(v, 0, Math.max(0, this.e() - 1));
        this.W2(this.y);
        this.x1();
    }

    private int B2() {
        if(!this.R()) {
            return this.u2() == 1 ? this.h0() : this.j0();
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int C1(int v, u recyclerView$u0, y recyclerView$y0) {
        return this.q() ? this.P2(v, recyclerView$u0, recyclerView$y0) : 0;
    }

    // 去混淆评级： 低(20)
    private int C2(int v, f f0) {
        return this.F2() ? ((int)(((float)this.n2()) - f0.h().a - ((float)v) * f0.f() - f0.f() / 2.0f)) : ((int)(((float)v) * f0.f() - f0.a().a + f0.f() / 2.0f));
    }

    private int D2(int v, f f0) {
        int v1 = 0x7FFFFFFF;
        for(Object object0: f0.e()) {
            com.google.android.material.carousel.f.c f$c0 = (com.google.android.material.carousel.f.c)object0;
            float f1 = ((float)v) * f0.f() + f0.f() / 2.0f;
            int v2 = (this.F2() ? ((int)(((float)this.n2()) - f$c0.a - f1)) : ((int)(f1 - f$c0.a))) - this.s;
            if(Math.abs(v1) > Math.abs(v2)) {
                v1 = v2;
            }
        }
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void E0(View view0, int v, int v1) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    private static d E2(List list0, float f, boolean z) {
        float f1 = 3.402823E+38f;
        int v = -1;
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        float f2 = -3.402823E+38f;
        float f3 = 3.402823E+38f;
        float f4 = 3.402823E+38f;
        for(int v4 = 0; v4 < list0.size(); ++v4) {
            com.google.android.material.carousel.f.c f$c0 = (com.google.android.material.carousel.f.c)list0.get(v4);
            float f5 = z ? f$c0.b : f$c0.a;
            float f6 = Math.abs(f5 - f);
            if(f5 <= f && f6 <= f1) {
                v = v4;
                f1 = f6;
            }
            if(f5 > f && f6 <= f3) {
                v2 = v4;
                f3 = f6;
            }
            if(f5 <= f4) {
                v1 = v4;
                f4 = f5;
            }
            if(f5 > f2) {
                v3 = v4;
                f2 = f5;
            }
        }
        if(v == -1) {
            v = v1;
        }
        if(v2 == -1) {
            v2 = v3;
        }
        return new d(((com.google.android.material.carousel.f.c)list0.get(v)), ((com.google.android.material.carousel.f.c)list0.get(v2)));
    }

    boolean F2() {
        return this.f() && this.d0() == 1;
    }

    private boolean G2(float f, d carouselLayoutManager$d0) {
        float f1 = this.Z1(f, this.s2(f, carouselLayoutManager$d0) / 2.0f);
        return this.F2() ? f1 < 0.0f : f1 > ((float)this.n2());
    }

    private boolean H2(float f, d carouselLayoutManager$d0) {
        float f1 = this.Y1(f, this.s2(f, carouselLayoutManager$d0) / 2.0f);
        return this.F2() ? f1 > ((float)this.n2()) : f1 < 0.0f;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public p I() {
        return new p(-2, -2);
    }

    private void I2(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        if(v != v4 || v1 != v5 || v2 != v6 || v3 != v7) {
            view0.post(() -> this.N2());
        }
    }

    private void J2() {
        if(!this.v) {
            return;
        }
        if(Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for(int v = 0; v < this.O(); ++v) {
                View view0 = this.N(v);
                float f = this.o2(view0);
                Log.d("CarouselLayoutManager", "item position " + this.l0(view0) + ", center:" + f + ", child index:" + v);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void K0(RecyclerView recyclerView0) {
        super.K0(recyclerView0);
        this.x.e(recyclerView0.getContext());
        this.N2();
        recyclerView0.addOnLayoutChangeListener(this.D);
    }

    private com.google.android.material.carousel.CarouselLayoutManager.b K2(u recyclerView$u0, float f, int v) {
        View view0 = recyclerView$u0.o(v);
        this.E0(view0, 0, 0);
        float f1 = this.Y1(f, this.z.f() / 2.0f);
        d carouselLayoutManager$d0 = CarouselLayoutManager.E2(this.z.g(), f1, false);
        return new com.google.android.material.carousel.CarouselLayoutManager.b(view0, f1, this.d2(view0, f1, carouselLayoutManager$d0), carouselLayoutManager$d0);
    }

    private float L2(View view0, float f, float f1, Rect rect0) {
        float f2 = this.Y1(f, f1);
        float f3 = this.d2(view0, f2, CarouselLayoutManager.E2(this.z.g(), f2, false));
        super.U(view0, rect0);
        this.C.l(view0, rect0, f1, f3);
        return f3;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M0(RecyclerView recyclerView0, u recyclerView$u0) {
        super.M0(recyclerView0, recyclerView$u0);
        recyclerView0.removeOnLayoutChangeListener(this.D);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void M1(RecyclerView recyclerView0, y recyclerView$y0, int v) {
        class com.google.android.material.carousel.CarouselLayoutManager.a extends androidx.recyclerview.widget.g {
            final CarouselLayoutManager q;

            com.google.android.material.carousel.CarouselLayoutManager.a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$x
            public PointF a(int v) {
                return CarouselLayoutManager.this.c(v);
            }

            @Override  // androidx.recyclerview.widget.g
            public int t(View view0, int v) {
                if(CarouselLayoutManager.this.y != null && CarouselLayoutManager.this.f()) {
                    int v1 = CarouselLayoutManager.this.l0(view0);
                    return CarouselLayoutManager.this.g2(v1);
                }
                return 0;
            }

            @Override  // androidx.recyclerview.widget.g
            public int u(View view0, int v) {
                if(CarouselLayoutManager.this.y != null && !CarouselLayoutManager.this.f()) {
                    int v1 = CarouselLayoutManager.this.l0(view0);
                    return CarouselLayoutManager.this.g2(v1);
                }
                return 0;
            }
        }

        com.google.android.material.carousel.CarouselLayoutManager.a carouselLayoutManager$a0 = new com.google.android.material.carousel.CarouselLayoutManager.a(this, recyclerView0.getContext());
        carouselLayoutManager$a0.p(v);
        this.N1(carouselLayoutManager$a0);
    }

    private void M2(u recyclerView$u0) {
        View view0 = recyclerView$u0.o(0);
        this.E0(view0, 0, 0);
        f f0 = this.x.g(this, view0);
        if(this.F2()) {
            f0 = f.n(f0, ((float)this.n2()));
        }
        this.y = g.f(this, f0, ((float)this.p2()), ((float)this.r2()), ((float)this.B2()));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public View N0(View view0, int v, u recyclerView$u0, y recyclerView$y0) {
        if(this.O() == 0) {
            return null;
        }
        int v1 = this.j2(v);
        if(v1 == 0x80000000) {
            return null;
        }
        if(v1 == -1) {
            if(this.l0(view0) == 0) {
                return null;
            }
            this.a2(recyclerView$u0, this.l0(this.N(0)) - 1, 0);
            return this.m2();
        }
        if(this.l0(view0) == this.e() - 1) {
            return null;
        }
        this.a2(recyclerView$u0, this.l0(this.N(this.O() - 1)) + 1, -1);
        return this.l2();
    }

    private void N2() {
        this.y = null;
        this.x1();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void O0(AccessibilityEvent accessibilityEvent0) {
        super.O0(accessibilityEvent0);
        if(this.O() > 0) {
            accessibilityEvent0.setFromIndex(this.l0(this.N(0)));
            accessibilityEvent0.setToIndex(this.l0(this.N(this.O() - 1)));
        }
    }

    private void O2(u recyclerView$u0) {
        while(this.O() > 0) {
            View view0 = this.N(0);
            float f = this.o2(view0);
            if(!this.H2(f, CarouselLayoutManager.E2(this.z.g(), f, true))) {
                break;
            }
            this.q1(view0, recyclerView$u0);
        }
        while(this.O() - 1 >= 0) {
            View view1 = this.N(this.O() - 1);
            float f1 = this.o2(view1);
            if(!this.G2(f1, CarouselLayoutManager.E2(this.z.g(), f1, true))) {
                break;
            }
            this.q1(view1, recyclerView$u0);
        }
    }

    private int P2(int v, u recyclerView$u0, y recyclerView$y0) {
        if(this.O() != 0 && v != 0) {
            if(this.y == null) {
                this.M2(recyclerView$u0);
            }
            int v2 = CarouselLayoutManager.h2(v, this.s, this.t, this.u);
            this.s += v2;
            this.W2(this.y);
            float f = this.z.f();
            float f1 = this.e2(this.l0(this.N(0)));
            Rect rect0 = new Rect();
            float f2 = this.F2() ? this.z.h().b : this.z.a().b;
            float f3 = 3.402823E+38f;
            for(int v1 = 0; v1 < this.O(); ++v1) {
                View view0 = this.N(v1);
                float f4 = Math.abs(f2 - this.L2(view0, f1, f / 2.0f, rect0));
                if(view0 != null && f4 < f3) {
                    this.F = this.l0(view0);
                    f3 = f4;
                }
                f1 = this.Y1(f1, this.z.f());
            }
            this.k2(recyclerView$u0, recyclerView$y0);
            return v2;
        }
        return 0;
    }

    // 检测为 Lambda 实现
    public static void Q1(CarouselLayoutManager carouselLayoutManager0) [...]

    private void Q2(RecyclerView recyclerView0, int v) {
        if(this.f()) {
            recyclerView0.scrollBy(v, 0);
            return;
        }
        recyclerView0.scrollBy(0, v);
    }

    // 检测为 Lambda 实现
    public static void R1(CarouselLayoutManager carouselLayoutManager0, View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    public void R2(int v) {
        this.G = v;
        this.N2();
    }

    private void S2(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, k.X0);
            this.R2(typedArray0.getInt(k.Y0, 0));
            this.U2(typedArray0.getInt(k.l6, 0));
            typedArray0.recycle();
        }
    }

    public void T2(com.google.android.material.carousel.d d0) {
        this.x = d0;
        this.N2();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void U(View view0, Rect rect0) {
        super.U(view0, rect0);
        float f = (float)rect0.centerY();
        if(this.f()) {
            f = (float)rect0.centerX();
        }
        float f1 = this.s2(f, CarouselLayoutManager.E2(this.z.g(), f, true));
        float f2 = 0.0f;
        float f3 = this.f() ? (((float)rect0.width()) - f1) / 2.0f : 0.0f;
        if(!this.f()) {
            f2 = (((float)rect0.height()) - f1) / 2.0f;
        }
        rect0.set(((int)(((float)rect0.left) + f3)), ((int)(((float)rect0.top) + f2)), ((int)(((float)rect0.right) - f3)), ((int)(((float)rect0.bottom) - f2)));
    }

    public void U2(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("invalid orientation:" + v);
        }
        this.l(null);
        if(this.C == null || v != this.C.a) {
            this.C = com.google.android.material.carousel.c.b(this, v);
            this.N2();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void V0(RecyclerView recyclerView0, int v, int v1) {
        super.V0(recyclerView0, v, v1);
        this.X2();
    }

    private void V2(View view0, float f, d carouselLayoutManager$d0) {
    }

    private void W2(g g0) {
        int v = this.u;
        int v1 = this.t;
        if(v <= v1) {
            this.z = this.F2() ? g0.h() : g0.l();
        }
        else {
            this.z = g0.j(((float)this.s), ((float)v1), ((float)v));
        }
        this.w.j(this.z.g());
    }

    private void X1(View view0, int v, com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0) {
        float f = this.z.f();
        this.j(view0, v);
        this.C.k(view0, ((int)(carouselLayoutManager$b0.c - f / 2.0f)), ((int)(carouselLayoutManager$b0.c + f / 2.0f)));
    }

    private void X2() {
        int v = this.e();
        int v1 = this.E;
        if(v != v1 && this.y != null) {
            if(this.x.h(this, v1)) {
                this.N2();
            }
            this.E = v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void Y0(RecyclerView recyclerView0, int v, int v1) {
        super.Y0(recyclerView0, v, v1);
        this.X2();
    }

    // 去混淆评级： 低(20)
    private float Y1(float f, float f1) {
        return this.F2() ? f - f1 : f + f1;
    }

    private void Y2() {
        if(this.v && this.O() >= 1) {
            int v = 0;
            while(v < this.O() - 1) {
                int v1 = this.l0(this.N(v));
                int v2 = this.l0(this.N(v + 1));
                if(v1 <= v2) {
                    ++v;
                    continue;
                }
                this.J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + v + "] had adapter position [" + v1 + "] and child at index [" + (v + 1) + "] had adapter position [" + v2 + "].");
            }
        }
    }

    // 去混淆评级： 低(20)
    private float Z1(float f, float f1) {
        return this.F2() ? f + f1 : f - f1;
    }

    @Override  // com.google.android.material.carousel.b
    public int a() {
        return this.s0();
    }

    private void a2(u recyclerView$u0, int v, int v1) {
        if(v >= 0 && v < this.e()) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.K2(recyclerView$u0, this.e2(v), v);
            this.X1(carouselLayoutManager$b0.a, v1, carouselLayoutManager$b0);
        }
    }

    @Override  // com.google.android.material.carousel.b
    public int b() {
        return this.b0();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void b1(u recyclerView$u0, y recyclerView$y0) {
        if(recyclerView$y0.b() > 0 && ((float)this.n2()) > 0.0f) {
            boolean z = this.F2();
            boolean z1 = this.y == null;
            if(z1) {
                this.M2(recyclerView$u0);
            }
            int v = this.i2(this.y);
            int v1 = this.f2(recyclerView$y0, this.y);
            this.t = z ? v1 : v;
            if(z) {
                v1 = v;
            }
            this.u = v1;
            if(z1) {
                this.s = v;
                this.B = this.y.i(this.e(), this.t, this.u, this.F2());
                int v2 = this.F;
                if(v2 != -1) {
                    this.s = this.C2(v2, this.q2(v2));
                }
            }
            this.s += CarouselLayoutManager.h2(0, this.s, this.t, this.u);
            this.A = a.b(this.A, 0, recyclerView$y0.b());
            this.W2(this.y);
            this.B(recyclerView$u0);
            this.k2(recyclerView$u0, recyclerView$y0);
            this.E = this.e();
            return;
        }
        this.o1(recyclerView$u0);
        this.A = 0;
    }

    private void b2(u recyclerView$u0, y recyclerView$y0, int v) {
        float f = this.e2(v);
        while(v < recyclerView$y0.b()) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.K2(recyclerView$u0, f, v);
            if(this.G2(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                break;
            }
            f = this.Y1(f, this.z.f());
            if(!this.H2(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                this.X1(carouselLayoutManager$b0.a, -1, carouselLayoutManager$b0);
            }
            ++v;
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x$b
    public PointF c(int v) {
        if(this.y == null) {
            return null;
        }
        int v1 = this.t2(v, this.q2(v));
        return this.f() ? new PointF(((float)v1), 0.0f) : new PointF(0.0f, ((float)v1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public void c1(y recyclerView$y0) {
        super.c1(recyclerView$y0);
        this.A = this.O() == 0 ? 0 : this.l0(this.N(0));
        this.Y2();
    }

    private void c2(u recyclerView$u0, int v) {
        float f = this.e2(v);
        while(v >= 0) {
            com.google.android.material.carousel.CarouselLayoutManager.b carouselLayoutManager$b0 = this.K2(recyclerView$u0, f, v);
            if(this.H2(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                break;
            }
            f = this.Z1(f, this.z.f());
            if(!this.G2(carouselLayoutManager$b0.c, carouselLayoutManager$b0.d)) {
                this.X1(carouselLayoutManager$b0.a, 0, carouselLayoutManager$b0);
            }
            --v;
        }
    }

    @Override  // com.google.android.material.carousel.b
    public int d() {
        return this.G;
    }

    private float d2(View view0, float f, d carouselLayoutManager$d0) {
        float f1 = A1.a.b(carouselLayoutManager$d0.a.b, carouselLayoutManager$d0.b.b, carouselLayoutManager$d0.a.a, carouselLayoutManager$d0.b.a, f);
        com.google.android.material.carousel.f.c f$c0 = this.z.c();
        if(carouselLayoutManager$d0.b != f$c0) {
            com.google.android.material.carousel.f.c f$c1 = this.z.j();
            if(carouselLayoutManager$d0.a != f$c1) {
                return f1;
            }
        }
        p recyclerView$p0 = (p)view0.getLayoutParams();
        float f2 = this.C.d(recyclerView$p0);
        return f1 + (f - carouselLayoutManager$d0.b.a) * (1.0f - carouselLayoutManager$d0.b.c + f2 / this.z.f());
    }

    private float e2(int v) {
        return this.Y1(((float)(this.z2() - this.s)), this.z.f() * ((float)v));
    }

    @Override  // com.google.android.material.carousel.b
    public boolean f() {
        return this.C.a == 0;
    }

    private int f2(y recyclerView$y0, g g0) {
        boolean z = this.F2();
        f f0 = z ? g0.l() : g0.h();
        com.google.android.material.carousel.f.c f$c0 = z ? f0.a() : f0.h();
        int v = recyclerView$y0.b();
        float f1 = (float)this.z2();
        float f2 = (float)this.w2();
        int v1 = (int)(((float)(v - 1)) * f0.f() * (z ? -1.0f : 1.0f) - (f$c0.a - f1) + (f2 - f$c0.a) + (z ? -f$c0.g : f$c0.h));
        return z ? Math.min(0, v1) : Math.max(0, v1);
    }

    int g2(int v) {
        float f = (float)this.C2(v, this.q2(v));
        return (int)(((float)this.s) - f);
    }

    private static int h2(int v, int v1, int v2, int v3) {
        int v4 = v1 + v;
        if(v4 < v2) {
            return v2 - v1;
        }
        return v4 <= v3 ? v : v3 - v1;
    }

    private int i2(g g0) {
        boolean z = this.F2();
        f f0 = z ? g0.h() : g0.l();
        float f1 = this.Z1((z ? f0.h() : f0.a()).a, f0.f() / 2.0f);
        return (int)(((float)this.z2()) - f1);
    }

    private int j2(int v) {
        int v1 = this.u2();
        switch(v) {
            case 1: {
                return -1;
            }
            case 2: {
                return 1;
            }
            case 17: {
                if(v1 == 0) {
                    return this.F2() ? 1 : -1;
                }
                return 0x80000000;
            }
            case 33: {
                return v1 == 1 ? -1 : 0x80000000;
            }
            case 66: {
                if(v1 == 0) {
                    return this.F2() ? -1 : 1;
                }
                return 0x80000000;
            }
            case 130: {
                return v1 == 1 ? 1 : 0x80000000;
            }
            default: {
                Log.d("CarouselLayoutManager", "Unknown focus request:" + v);
                return 0x80000000;
            }
        }
    }

    private void k2(u recyclerView$u0, y recyclerView$y0) {
        this.O2(recyclerView$u0);
        if(this.O() == 0) {
            this.c2(recyclerView$u0, this.A - 1);
            this.b2(recyclerView$u0, recyclerView$y0, this.A);
        }
        else {
            int v = this.l0(this.N(0));
            int v1 = this.l0(this.N(this.O() - 1));
            this.c2(recyclerView$u0, v - 1);
            this.b2(recyclerView$u0, recyclerView$y0, v1 + 1);
        }
        this.Y2();
    }

    // 去混淆评级： 低(20)
    private View l2() {
        return this.F2() ? this.N(0) : this.N(this.O() - 1);
    }

    // 去混淆评级： 低(20)
    private View m2() {
        return this.F2() ? this.N(this.O() - 1) : this.N(0);
    }

    // 去混淆评级： 低(20)
    private int n2() {
        return this.f() ? this.a() : this.b();
    }

    private float o2(View view0) {
        Rect rect0 = new Rect();
        super.U(view0, rect0);
        return this.f() ? ((float)rect0.centerX()) : ((float)rect0.centerY());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean p() {
        return this.f();
    }

    private int p2() {
        if(this.O() > 0) {
            p recyclerView$p0 = (p)this.N(0).getLayoutParams();
            return this.C.a == 0 ? recyclerView$p0.leftMargin + recyclerView$p0.rightMargin : recyclerView$p0.topMargin + recyclerView$p0.bottomMargin;
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean q() {
        return !this.f();
    }

    private f q2(int v) {
        Map map0 = this.B;
        if(map0 != null) {
            f f0 = (f)map0.get(a.b(v, 0, Math.max(0, this.e() - 1)));
            return f0 == null ? this.y.g() : f0;
        }
        return this.y.g();
    }

    private int r2() {
        if(!this.R()) {
            return this.u2() == 1 ? this.k0() : this.i0();
        }
        return 0;
    }

    private float s2(float f, d carouselLayoutManager$d0) {
        return A1.a.b(carouselLayoutManager$d0.a.d, carouselLayoutManager$d0.b.d, carouselLayoutManager$d0.a.b, carouselLayoutManager$d0.b.b, f);
    }

    int t2(int v, f f0) {
        return this.C2(v, f0) - this.s;
    }

    public int u2() {
        return this.C.a;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int v(y recyclerView$y0) {
        return this.O() == 0 || this.y == null || this.e() <= 1 ? 0 : ((int)(((float)this.s0()) * (this.y.g().f() / ((float)this.x(recyclerView$y0)))));
    }

    private int v2() {
        return this.C.e();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int w(y recyclerView$y0) {
        return this.s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean w0() {
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public boolean w1(RecyclerView recyclerView0, View view0, Rect rect0, boolean z, boolean z1) {
        if(this.y == null) {
            return false;
        }
        int v = this.D2(this.l0(view0), this.q2(this.l0(view0)));
        if(v == 0) {
            return false;
        }
        f f0 = this.y.j(((float)(this.s + CarouselLayoutManager.h2(v, this.s, this.t, this.u))), ((float)this.t), ((float)this.u));
        this.Q2(recyclerView0, this.D2(this.l0(view0), f0));
        return true;
    }

    private int w2() {
        return this.C.f();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int x(y recyclerView$y0) {
        return this.u - this.t;
    }

    private int x2() {
        return this.C.g();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int y(y recyclerView$y0) {
        return this.O() == 0 || this.y == null || this.e() <= 1 ? 0 : ((int)(((float)this.b0()) * (this.y.g().f() / ((float)this.A(recyclerView$y0)))));
    }

    private int y2() {
        return this.C.h();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$o
    public int z(y recyclerView$y0) {
        return this.s;
    }

    private int z2() {
        return this.C.i();
    }
}

