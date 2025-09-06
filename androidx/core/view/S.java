package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

public abstract class s {
    public static void a(int v, int v1, int v2, Rect rect0, Rect rect1, int v3) {
        Gravity.apply(v, v1, v2, rect0, rect1, v3);
    }

    public static int b(int v, int v1) {
        return Gravity.getAbsoluteGravity(v, v1);
    }
}

