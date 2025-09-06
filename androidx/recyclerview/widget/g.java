package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class g extends x {
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m;
    private float n;
    protected int o;
    protected int p;

    public g(Context context0) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context0.getResources().getDisplayMetrics();
    }

    private float A() {
        if(!this.m) {
            this.n = this.v(this.l);
            this.m = true;
        }
        return this.n;
    }

    protected int B() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            float f = pointF0.y;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(a recyclerView$x$a0) {
        PointF pointF0 = this.a(this.f());
        if(pointF0 != null && (pointF0.x != 0.0f || pointF0.y != 0.0f)) {
            this.i(pointF0);
            this.k = pointF0;
            this.o = (int)(pointF0.x * 10000.0f);
            this.p = (int)(pointF0.y * 10000.0f);
            int v = this.x(10000);
            recyclerView$x$a0.d(((int)(((float)this.o) * 1.2f)), ((int)(((float)this.p) * 1.2f)), ((int)(((float)v) * 1.2f)), this.i);
            return;
        }
        recyclerView$x$a0.b(this.f());
        this.r();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x
    protected void l(int v, int v1, y recyclerView$y0, a recyclerView$x$a0) {
        if(this.c() == 0) {
            this.r();
            return;
        }
        this.o = this.y(this.o, v);
        int v2 = this.y(this.p, v1);
        this.p = v2;
        if(this.o == 0 && v2 == 0) {
            this.C(recyclerView$x$a0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x
    protected void m() {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x
    protected void n() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$x
    protected void o(View view0, y recyclerView$y0, a recyclerView$x$a0) {
        int v = this.t(view0, this.z());
        int v1 = this.u(view0, this.B());
        int v2 = this.w(((int)Math.sqrt(v * v + v1 * v1)));
        if(v2 > 0) {
            recyclerView$x$a0.d(-v, -v1, v2, this.j);
        }
    }

    public int s(int v, int v1, int v2, int v3, int v4) {
        switch(v4) {
            case -1: {
                return v2 - v;
            }
            case 0: {
                int v5 = v2 - v;
                if(v5 > 0) {
                    return v5;
                }
                int v6 = v3 - v1;
                return v6 >= 0 ? 0 : v6;
            }
            default: {
                if(v4 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return v3 - v1;
            }
        }
    }

    public int t(View view0, int v) {
        o recyclerView$o0 = this.e();
        if(recyclerView$o0 != null && recyclerView$o0.p()) {
            p recyclerView$p0 = (p)view0.getLayoutParams();
            return this.s(recyclerView$o0.V(view0) - recyclerView$p0.leftMargin, recyclerView$o0.Y(view0) + recyclerView$p0.rightMargin, recyclerView$o0.i0(), recyclerView$o0.s0() - recyclerView$o0.j0(), v);
        }
        return 0;
    }

    public int u(View view0, int v) {
        o recyclerView$o0 = this.e();
        if(recyclerView$o0 != null && recyclerView$o0.q()) {
            p recyclerView$p0 = (p)view0.getLayoutParams();
            return this.s(recyclerView$o0.Z(view0) - recyclerView$p0.topMargin, recyclerView$o0.T(view0) + recyclerView$p0.bottomMargin, recyclerView$o0.k0(), recyclerView$o0.b0() - recyclerView$o0.h0(), v);
        }
        return 0;
    }

    protected float v(DisplayMetrics displayMetrics0) {
        return 25.0f / ((float)displayMetrics0.densityDpi);
    }

    protected int w(int v) {
        return (int)Math.ceil(((double)this.x(v)) / 0.3356);
    }

    protected int x(int v) {
        return (int)Math.ceil(((float)Math.abs(v)) * this.A());
    }

    private int y(int v, int v1) {
        int v2 = v - v1;
        return v * v2 > 0 ? v2 : 0;
    }

    protected int z() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            float f = pointF0.x;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}

