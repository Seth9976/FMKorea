package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public abstract class a {
    static abstract class androidx.core.view.animation.a.a {
        static Interpolator a(float f, float f1) {
            return new PathInterpolator(f, f1);
        }

        static Interpolator b(float f, float f1, float f2, float f3) {
            return new PathInterpolator(f, f1, f2, f3);
        }

        static Interpolator c(Path path0) {
            return new PathInterpolator(path0);
        }
    }

    public static Interpolator a(float f, float f1, float f2, float f3) {
        return androidx.core.view.animation.a.a.b(f, f1, f2, f3);
    }

    public static Interpolator b(Path path0) {
        return androidx.core.view.animation.a.a.c(path0);
    }
}

