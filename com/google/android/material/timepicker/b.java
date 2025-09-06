package com.google.android.material.timepicker;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final ClockHandView a;

    public b(ClockHandView clockHandView0) {
        this.a = clockHandView0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        this.a.l(valueAnimator0);
    }
}

