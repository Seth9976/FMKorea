package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.p;

abstract class c {
    final int a;

    private c(int v) {
        this.a = v;
    }

    c(int v, a c$a0) {
        this(v);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager0) {
        class b extends c {
            final CarouselLayoutManager b;

            b(int v, CarouselLayoutManager carouselLayoutManager0) {
                this.b = carouselLayoutManager0;
                super(v, null);
            }

            @Override  // com.google.android.material.carousel.c
            public float d(p recyclerView$p0) {
                return (float)(recyclerView$p0.rightMargin + recyclerView$p0.leftMargin);
            }

            @Override  // com.google.android.material.carousel.c
            int e() {
                int v = this.b.h0();
                return this.b.b0() - v;
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.android.material.carousel.c
            int f() {
                return this.b.F2() ? 0 : this.h();
            }

            @Override  // com.google.android.material.carousel.c
            int g() [...] // Inlined contents

            @Override  // com.google.android.material.carousel.c
            int h() {
                return this.b.s0();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.android.material.carousel.c
            int i() {
                return this.b.F2() ? this.h() : 0;
            }

            @Override  // com.google.android.material.carousel.c
            int j() {
                return this.b.k0();
            }

            @Override  // com.google.android.material.carousel.c
            public void k(View view0, int v, int v1) {
                int v2 = this.j();
                int v3 = this.m(view0);
                this.b.D0(view0, v, v2, v1, v2 + v3);
            }

            @Override  // com.google.android.material.carousel.c
            public void l(View view0, Rect rect0, float f, float f1) {
                view0.offsetLeftAndRight(((int)(f1 - (((float)rect0.left) + f))));
            }

            int m(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.b.W(view0) + recyclerView$p0.topMargin + recyclerView$p0.bottomMargin;
            }
        }

        return new b(0, carouselLayoutManager0);
    }

    static c b(CarouselLayoutManager carouselLayoutManager0, int v) {
        switch(v) {
            case 0: {
                return c.a(carouselLayoutManager0);
            }
            case 1: {
                return c.c(carouselLayoutManager0);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    private static c c(CarouselLayoutManager carouselLayoutManager0) {
        class a extends c {
            final CarouselLayoutManager b;

            a(int v, CarouselLayoutManager carouselLayoutManager0) {
                this.b = carouselLayoutManager0;
                super(v, null);
            }

            @Override  // com.google.android.material.carousel.c
            public float d(p recyclerView$p0) {
                return (float)(recyclerView$p0.topMargin + recyclerView$p0.bottomMargin);
            }

            @Override  // com.google.android.material.carousel.c
            int e() {
                return this.b.b0();
            }

            @Override  // com.google.android.material.carousel.c
            int f() {
                return this.e();
            }

            @Override  // com.google.android.material.carousel.c
            int g() {
                return this.b.i0();
            }

            @Override  // com.google.android.material.carousel.c
            int h() {
                int v = this.b.j0();
                return this.b.s0() - v;
            }

            @Override  // com.google.android.material.carousel.c
            int i() {
                return 0;
            }

            @Override  // com.google.android.material.carousel.c
            int j() [...] // Inlined contents

            @Override  // com.google.android.material.carousel.c
            public void k(View view0, int v, int v1) {
                int v2 = this.g();
                int v3 = this.m(view0);
                this.b.D0(view0, v2, v, v2 + v3, v1);
            }

            @Override  // com.google.android.material.carousel.c
            public void l(View view0, Rect rect0, float f, float f1) {
                view0.offsetTopAndBottom(((int)(f1 - (((float)rect0.top) + f))));
            }

            int m(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.b.X(view0) + recyclerView$p0.leftMargin + recyclerView$p0.rightMargin;
            }
        }

        return new a(1, carouselLayoutManager0);
    }

    abstract float d(p arg1);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View arg1, int arg2, int arg3);

    abstract void l(View arg1, Rect arg2, float arg3, float arg4);
}

