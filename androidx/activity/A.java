package androidx.activity;

import android.window.BackEvent;
import z3.k;

public final class a {
    public static final a a;

    static {
        a.a = new a();
    }

    public final BackEvent a(float f, float f1, float f2, int v) {
        return new BackEvent(f, f1, f2, v);
    }

    public final float b(BackEvent backEvent0) {
        k.e(backEvent0, "backEvent");
        return backEvent0.getProgress();
    }

    public final int c(BackEvent backEvent0) {
        k.e(backEvent0, "backEvent");
        return backEvent0.getSwipeEdge();
    }

    public final float d(BackEvent backEvent0) {
        k.e(backEvent0, "backEvent");
        return backEvent0.getTouchX();
    }

    public final float e(BackEvent backEvent0) {
        k.e(backEvent0, "backEvent");
        return backEvent0.getTouchY();
    }
}

