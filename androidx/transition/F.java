package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

abstract class f {
    static abstract class a {
        static ObjectAnimator a(Object object0, Property property0, Path path0) {
            return ObjectAnimator.ofObject(object0, property0, null, path0);
        }
    }

    static ObjectAnimator a(Object object0, Property property0, Path path0) {
        return a.a(object0, property0, path0);
    }
}

