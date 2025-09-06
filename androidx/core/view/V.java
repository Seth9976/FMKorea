package androidx.core.view;

import android.view.ViewGroup.MarginLayoutParams;

public abstract class v {
    public static int a(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginEnd();
    }

    public static int b(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return viewGroup$MarginLayoutParams0.getMarginStart();
    }

    public static void c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginEnd(v);
    }

    public static void d(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        viewGroup$MarginLayoutParams0.setMarginStart(v);
    }
}

