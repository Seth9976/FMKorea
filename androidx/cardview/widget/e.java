package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

abstract class e extends Drawable {
    private static final double a;

    static {
        e.a = 0.707107;
    }

    // 去混淆评级： 低(20)
    static float a(float f, float f1, boolean z) {
        return z ? ((float)(((double)f) + (1.0 - e.a) * ((double)f1))) : f;
    }

    // 去混淆评级： 低(20)
    static float b(float f, float f1, boolean z) {
        return z ? ((float)(((double)(f * 1.5f)) + (1.0 - e.a) * ((double)f1))) : f * 1.5f;
    }
}

