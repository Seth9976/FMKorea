package co.median.android.widget;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;

public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final g a;

    public e(g g0) {
        this.a = g0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        g.l(this.a, valueAnimator0);
    }
}

