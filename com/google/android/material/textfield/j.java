package com.google.android.material.textfield;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final q a;

    public j(q q0) {
        this.a = q0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        q.x(this.a, valueAnimator0);
    }
}

