package com.google.android.material.appbar;

import S1.g;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final g b;

    public c(AppBarLayout appBarLayout0, g g0) {
        this.a = appBarLayout0;
        this.b = g0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.r(this.b, valueAnimator0);
    }
}

