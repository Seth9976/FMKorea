package com.google.android.material.behavior;

import M1.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.a;

public class HideBottomViewOnScrollBehavior extends c {
    private final LinkedHashSet f;
    private int g;
    private int h;
    private TimeInterpolator i;
    private TimeInterpolator j;
    private int k;
    private int l;
    private int m;
    private ViewPropertyAnimator n;
    private static final int o;
    private static final int p;
    private static final int q;

    static {
        HideBottomViewOnScrollBehavior.o = a.C;
        HideBottomViewOnScrollBehavior.p = a.E;
        HideBottomViewOnScrollBehavior.q = a.J;
    }

    public HideBottomViewOnScrollBehavior() {
        this.f = new LinkedHashSet();
        this.k = 0;
        this.l = 2;
        this.m = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new LinkedHashSet();
        this.k = 0;
        this.l = 2;
        this.m = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean E(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
        return v == 2;
    }

    private void J(View view0, int v, long v1, TimeInterpolator timeInterpolator0) {
        class com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a extends AnimatorListenerAdapter {
            final HideBottomViewOnScrollBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                HideBottomViewOnScrollBehavior.this.n = null;
            }
        }

        this.n = view0.animate().translationY(((float)v)).setInterpolator(timeInterpolator0).setDuration(v1).setListener(new com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a(this));
    }

    public boolean K() {
        return this.l == 1;
    }

    public boolean L() {
        return this.l == 2;
    }

    public void M(View view0) {
        this.N(view0, true);
    }

    public void N(View view0, boolean z) {
        if(this.K()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.n;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.Q(view0, 1);
        int v = this.k + this.m;
        if(z) {
            this.J(view0, v, ((long)this.h), this.j);
            return;
        }
        view0.setTranslationY(((float)v));
    }

    public void O(View view0) {
        this.P(view0, true);
    }

    public void P(View view0, boolean z) {
        if(this.L()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.n;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.Q(view0, 2);
        if(z) {
            this.J(view0, 0, ((long)this.g), this.i);
            return;
        }
        view0.setTranslationY(0.0f);
    }

    private void Q(View view0, int v) {
        this.l = v;
        Iterator iterator0 = this.f.iterator();
        if(!iterator0.hasNext()) {
            return;
        }
        Object object0 = iterator0.next();
        E.a(object0);
        throw null;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public boolean p(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.k = view0.getMeasuredHeight() + viewGroup$MarginLayoutParams0.bottomMargin;
        this.g = h.f(view0.getContext(), HideBottomViewOnScrollBehavior.o, 0xE1);
        this.h = h.f(view0.getContext(), HideBottomViewOnScrollBehavior.p, 0xAF);
        this.i = h.g(view0.getContext(), HideBottomViewOnScrollBehavior.q, A1.a.d);
        this.j = h.g(view0.getContext(), HideBottomViewOnScrollBehavior.q, A1.a.c);
        return super.p(coordinatorLayout0, view0, v);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$c
    public void x(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(v1 > 0) {
            this.M(view0);
            return;
        }
        if(v1 < 0) {
            this.O(view0);
        }
    }
}

