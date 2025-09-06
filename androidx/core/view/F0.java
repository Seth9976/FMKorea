package androidx.core.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;

public final class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final j0 a;
    public final View b;

    public f0(j0 j00, View view0) {
        this.a = j00;
        this.b = view0;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        g0.e(this.a, this.b, valueAnimator0);
    }
}

