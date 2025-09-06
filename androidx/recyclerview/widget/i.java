package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class i {
    protected final o a;
    private int b;
    final Rect c;

    private i(o recyclerView$o0) {
        this.b = 0x80000000;
        this.c = new Rect();
        this.a = recyclerView$o0;
    }

    i(o recyclerView$o0, a i$a0) {
        this(recyclerView$o0);
    }

    public static i a(o recyclerView$o0) {
        static final class a extends i {
            a(o recyclerView$o0) {
                super(recyclerView$o0, null);
            }

            @Override  // androidx.recyclerview.widget.i
            public int d(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.Y(view0) + recyclerView$p0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int e(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.X(view0) + recyclerView$p0.leftMargin + recyclerView$p0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int f(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.W(view0) + recyclerView$p0.topMargin + recyclerView$p0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int g(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.V(view0) - recyclerView$p0.leftMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int h() {
                return this.a.s0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int i() {
                int v = this.a.j0();
                return this.a.s0() - v;
            }

            @Override  // androidx.recyclerview.widget.i
            public int j() {
                return this.a.j0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int k() {
                return this.a.t0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int l() {
                return this.a.c0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int m() {
                return this.a.i0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int n() {
                int v = this.a.i0();
                int v1 = this.a.j0();
                return this.a.s0() - v - v1;
            }

            @Override  // androidx.recyclerview.widget.i
            public int p(View view0) {
                this.a.r0(view0, true, this.c);
                return this.c.right;
            }

            @Override  // androidx.recyclerview.widget.i
            public int q(View view0) {
                this.a.r0(view0, true, this.c);
                return this.c.left;
            }

            @Override  // androidx.recyclerview.widget.i
            public void r(int v) {
                this.a.G0(v);
            }
        }

        return new a(recyclerView$o0);
    }

    public static i b(o recyclerView$o0, int v) {
        switch(v) {
            case 0: {
                return i.a(recyclerView$o0);
            }
            case 1: {
                return i.c(recyclerView$o0);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    public static i c(o recyclerView$o0) {
        static final class b extends i {
            b(o recyclerView$o0) {
                super(recyclerView$o0, null);
            }

            @Override  // androidx.recyclerview.widget.i
            public int d(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.T(view0) + recyclerView$p0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int e(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.W(view0) + recyclerView$p0.topMargin + recyclerView$p0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int f(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.X(view0) + recyclerView$p0.leftMargin + recyclerView$p0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int g(View view0) {
                p recyclerView$p0 = (p)view0.getLayoutParams();
                return this.a.Z(view0) - recyclerView$p0.topMargin;
            }

            @Override  // androidx.recyclerview.widget.i
            public int h() {
                return this.a.b0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int i() {
                int v = this.a.h0();
                return this.a.b0() - v;
            }

            @Override  // androidx.recyclerview.widget.i
            public int j() {
                return this.a.h0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int k() {
                return this.a.c0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int l() {
                return this.a.t0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int m() {
                return this.a.k0();
            }

            @Override  // androidx.recyclerview.widget.i
            public int n() {
                int v = this.a.k0();
                int v1 = this.a.h0();
                return this.a.b0() - v - v1;
            }

            @Override  // androidx.recyclerview.widget.i
            public int p(View view0) {
                this.a.r0(view0, true, this.c);
                return this.c.bottom;
            }

            @Override  // androidx.recyclerview.widget.i
            public int q(View view0) {
                this.a.r0(view0, true, this.c);
                return this.c.top;
            }

            @Override  // androidx.recyclerview.widget.i
            public void r(int v) {
                this.a.H0(v);
            }
        }

        return new b(recyclerView$o0);
    }

    public abstract int d(View arg1);

    public abstract int e(View arg1);

    public abstract int f(View arg1);

    public abstract int g(View arg1);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        return 0x80000000 == this.b ? 0 : this.n() - this.b;
    }

    public abstract int p(View arg1);

    public abstract int q(View arg1);

    public abstract void r(int arg1);

    public void s() {
        this.b = this.n();
    }
}

