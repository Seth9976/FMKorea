package androidx.core.view;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public abstract class r0 {
    public static WindowInsetsAnimation a(int v, Interpolator interpolator0, long v1) {
        return new WindowInsetsAnimation(v, interpolator0, v1);
    }
}

