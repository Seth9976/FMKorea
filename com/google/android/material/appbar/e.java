package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.core.view.s;
import androidx.core.view.y0;
import java.util.List;
import x.a;

abstract class e extends f {
    final Rect i;
    final Rect j;
    private int k;
    private int l;

    public e() {
        this.i = new Rect();
        this.j = new Rect();
        this.k = 0;
    }

    public e(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = new Rect();
        this.j = new Rect();
        this.k = 0;
    }

    @Override  // com.google.android.material.appbar.f
    protected void J(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        View view1 = this.L(coordinatorLayout0.r(view0));
        if(view1 != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout.f coordinatorLayout$f0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f)view0.getLayoutParams();
            Rect rect0 = this.i;
            rect0.set(coordinatorLayout0.getPaddingLeft() + coordinatorLayout$f0.leftMargin, view1.getBottom() + coordinatorLayout$f0.topMargin, coordinatorLayout0.getWidth() - coordinatorLayout0.getPaddingRight() - coordinatorLayout$f0.rightMargin, coordinatorLayout0.getHeight() + view1.getBottom() - coordinatorLayout0.getPaddingBottom() - coordinatorLayout$f0.bottomMargin);
            y0 y00 = coordinatorLayout0.getLastWindowInsets();
            if(y00 != null && Y.w(coordinatorLayout0) && !Y.w(view0)) {
                rect0.left += y00.j();
                rect0.right -= y00.k();
            }
            s.a(e.R(coordinatorLayout$f0.c), view0.getMeasuredWidth(), view0.getMeasuredHeight(), rect0, this.j, v);
            int v1 = this.M(view1);
            view0.layout(this.j.left, this.j.top - v1, this.j.right, this.j.bottom - v1);
            this.k = this.j.top - view1.getBottom();
            return;
        }
        super.J(coordinatorLayout0, view0, v);
        this.k = 0;
    }

    abstract View L(List arg1);

    final int M(View view0) {
        return this.l == 0 ? 0 : a.b(((int)(this.N(view0) * ((float)this.l))), 0, this.l);
    }

    abstract float N(View arg1);

    public final int O() {
        return this.l;
    }

    int P(View view0) {
        return view0.getMeasuredHeight();
    }

    final int Q() {
        return this.k;
    }

    private static int R(int v) {
        return v == 0 ? 0x800033 : v;
    }

    public final void S(int v) {
        this.l = v;
    }

    protected boolean T() {
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean q(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
        int v4 = view0.getLayoutParams().height;
        if(v4 == -2 || v4 == -1) {
            View view1 = this.L(coordinatorLayout0.r(view0));
            if(view1 != null) {
                int v5 = View.MeasureSpec.getSize(v2);
                if(v5 <= 0) {
                    v5 = coordinatorLayout0.getHeight();
                }
                else if(Y.w(view1)) {
                    y0 y00 = coordinatorLayout0.getLastWindowInsets();
                    if(y00 != null) {
                        v5 += y00.l() + y00.i();
                    }
                }
                int v6 = v5 + this.P(view1);
                int v7 = view1.getMeasuredHeight();
                if(this.T()) {
                    view0.setTranslationY(((float)(-v7)));
                }
                else {
                    view0.setTranslationY(0.0f);
                    v6 -= v7;
                }
                coordinatorLayout0.J(view0, v, v1, View.MeasureSpec.makeMeasureSpec(v6, (v4 == -1 ? 0x40000000 : 0x80000000)), v3);
                return true;
            }
        }
        return false;
    }
}

