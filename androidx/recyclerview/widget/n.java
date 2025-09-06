package androidx.recyclerview.widget;

import android.view.View;

public abstract class n extends l {
    boolean g;

    public n() {
        this.g = true;
    }

    public final void A(B recyclerView$B0) {
        this.h(recyclerView$B0);
    }

    public final void B(B recyclerView$B0) {
    }

    public final void C(B recyclerView$B0, boolean z) {
        this.h(recyclerView$B0);
    }

    public final void D(B recyclerView$B0, boolean z) {
    }

    public final void E(B recyclerView$B0) {
        this.h(recyclerView$B0);
    }

    public final void F(B recyclerView$B0) {
    }

    public final void G(B recyclerView$B0) {
        this.h(recyclerView$B0);
    }

    public final void H(B recyclerView$B0) {
    }

    public void I(B recyclerView$B0) {
    }

    public void J(B recyclerView$B0) {
    }

    public void K(B recyclerView$B0, boolean z) {
    }

    public void L(B recyclerView$B0, boolean z) {
    }

    public void M(B recyclerView$B0) {
    }

    public void N(B recyclerView$B0) {
    }

    public void O(B recyclerView$B0) {
    }

    public void P(B recyclerView$B0) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean a(B recyclerView$B0, b recyclerView$l$b0, b recyclerView$l$b1) {
        if(recyclerView$l$b0 != null) {
            int v = recyclerView$l$b0.a;
            int v1 = recyclerView$l$b1.a;
            return v == v1 && recyclerView$l$b0.b == recyclerView$l$b1.b ? this.w(recyclerView$B0) : this.y(recyclerView$B0, v, recyclerView$l$b0.b, v1, recyclerView$l$b1.b);
        }
        return this.w(recyclerView$B0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean b(B recyclerView$B0, B recyclerView$B1, b recyclerView$l$b0, b recyclerView$l$b1) {
        int v = recyclerView$l$b0.a;
        int v1 = recyclerView$l$b0.b;
        return recyclerView$B1.J() ? this.x(recyclerView$B0, recyclerView$B1, v, v1, recyclerView$l$b0.a, recyclerView$l$b0.b) : this.x(recyclerView$B0, recyclerView$B1, v, v1, recyclerView$l$b1.a, recyclerView$l$b1.b);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean c(B recyclerView$B0, b recyclerView$l$b0, b recyclerView$l$b1) {
        int v = recyclerView$l$b0.a;
        int v1 = recyclerView$l$b0.b;
        View view0 = recyclerView$B0.a;
        int v2 = recyclerView$l$b1 == null ? view0.getLeft() : recyclerView$l$b1.a;
        int v3 = recyclerView$l$b1 == null ? view0.getTop() : recyclerView$l$b1.b;
        if(!recyclerView$B0.v() && (v != v2 || v1 != v3)) {
            view0.layout(v2, v3, view0.getWidth() + v2, view0.getHeight() + v3);
            return this.y(recyclerView$B0, v, v1, v2, v3);
        }
        return this.z(recyclerView$B0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean d(B recyclerView$B0, b recyclerView$l$b0, b recyclerView$l$b1) {
        int v = recyclerView$l$b0.a;
        int v1 = recyclerView$l$b1.a;
        if(v == v1 && recyclerView$l$b0.b == recyclerView$l$b1.b) {
            this.E(recyclerView$B0);
            return false;
        }
        return this.y(recyclerView$B0, v, recyclerView$l$b0.b, v1, recyclerView$l$b1.b);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.recyclerview.widget.RecyclerView$l
    public boolean f(B recyclerView$B0) {
        return !this.g || recyclerView$B0.t();
    }

    public abstract boolean w(B arg1);

    public abstract boolean x(B arg1, B arg2, int arg3, int arg4, int arg5, int arg6);

    public abstract boolean y(B arg1, int arg2, int arg3, int arg4, int arg5);

    public abstract boolean z(B arg1);
}

