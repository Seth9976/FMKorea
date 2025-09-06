package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

public class j extends o {
    private i d;
    private i e;

    @Override  // androidx.recyclerview.widget.o
    public int[] c(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, View view0) {
        int[] arr_v = new int[2];
        arr_v[0] = recyclerView$o0.p() ? this.l(recyclerView$o0, view0, this.n(recyclerView$o0)) : 0;
        if(recyclerView$o0.q()) {
            arr_v[1] = this.l(recyclerView$o0, view0, this.p(recyclerView$o0));
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.o
    protected g e(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        class a extends g {
            final j q;

            a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.g
            protected void o(View view0, y recyclerView$y0, androidx.recyclerview.widget.RecyclerView.x.a recyclerView$x$a0) {
                int[] arr_v = j.this.c(j.this.a.getLayoutManager(), view0);
                int v = arr_v[0];
                int v1 = arr_v[1];
                int v2 = this.w(Math.max(Math.abs(v), Math.abs(v1)));
                if(v2 > 0) {
                    recyclerView$x$a0.d(v, v1, v2, this.j);
                }
            }

            @Override  // androidx.recyclerview.widget.g
            protected float v(DisplayMetrics displayMetrics0) {
                return 100.0f / ((float)displayMetrics0.densityDpi);
            }

            @Override  // androidx.recyclerview.widget.g
            protected int x(int v) {
                return Math.min(100, super.x(v));
            }
        }

        return !(recyclerView$o0 instanceof b) ? null : new a(this, this.a.getContext());
    }

    @Override  // androidx.recyclerview.widget.o
    public View g(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        if(recyclerView$o0.q()) {
            return this.m(recyclerView$o0, this.p(recyclerView$o0));
        }
        return recyclerView$o0.p() ? this.m(recyclerView$o0, this.n(recyclerView$o0)) : null;
    }

    @Override  // androidx.recyclerview.widget.o
    public int h(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, int v, int v1) {
        int v2 = recyclerView$o0.e();
        if(v2 == 0) {
            return -1;
        }
        i i0 = this.o(recyclerView$o0);
        if(i0 == null) {
            return -1;
        }
        int v3 = recyclerView$o0.O();
        View view0 = null;
        int v5 = 0x7FFFFFFF;
        int v6 = 0x80000000;
        View view1 = null;
        for(int v4 = 0; v4 < v3; ++v4) {
            View view2 = recyclerView$o0.N(v4);
            if(view2 != null) {
                int v7 = this.l(recyclerView$o0, view2, i0);
                if(v7 <= 0 && v7 > v6) {
                    view1 = view2;
                    v6 = v7;
                }
                if(v7 >= 0 && v7 < v5) {
                    view0 = view2;
                    v5 = v7;
                }
            }
        }
        boolean z = this.q(recyclerView$o0, v, v1);
        if(z && view0 != null) {
            return recyclerView$o0.l0(view0);
        }
        if(!z && view1 != null) {
            return recyclerView$o0.l0(view1);
        }
        if(z) {
            view0 = view1;
        }
        if(view0 == null) {
            return -1;
        }
        int v8 = recyclerView$o0.l0(view0) + (this.r(recyclerView$o0) == z ? -1 : 1);
        return v8 < 0 || v8 >= v2 ? -1 : v8;
    }

    private int l(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, View view0, i i0) {
        return i0.g(view0) + i0.e(view0) / 2 - (i0.m() + i0.n() / 2);
    }

    private View m(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, i i0) {
        int v = recyclerView$o0.O();
        View view0 = null;
        if(v == 0) {
            return null;
        }
        int v1 = i0.m();
        int v2 = i0.n();
        int v3 = 0x7FFFFFFF;
        for(int v4 = 0; v4 < v; ++v4) {
            View view1 = recyclerView$o0.N(v4);
            int v5 = Math.abs(i0.g(view1) + i0.e(view1) / 2 - (v1 + v2 / 2));
            if(v5 < v3) {
                view0 = view1;
                v3 = v5;
            }
        }
        return view0;
    }

    private i n(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        if(this.e == null || this.e.a != recyclerView$o0) {
            this.e = i.a(recyclerView$o0);
        }
        return this.e;
    }

    private i o(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        if(recyclerView$o0.q()) {
            return this.p(recyclerView$o0);
        }
        return recyclerView$o0.p() ? this.n(recyclerView$o0) : null;
    }

    private i p(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        if(this.d == null || this.d.a != recyclerView$o0) {
            this.d = i.c(recyclerView$o0);
        }
        return this.d;
    }

    // 去混淆评级： 低(20)
    private boolean q(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0, int v, int v1) {
        return recyclerView$o0.p() ? v > 0 : v1 > 0;
    }

    private boolean r(androidx.recyclerview.widget.RecyclerView.o recyclerView$o0) {
        int v = recyclerView$o0.e();
        if(recyclerView$o0 instanceof b) {
            PointF pointF0 = ((b)recyclerView$o0).c(v - 1);
            return pointF0 != null && (pointF0.x < 0.0f || pointF0.y < 0.0f);
        }
        return false;
    }
}

