package androidx.activity;

import android.window.BackEvent;
import z3.g;
import z3.k;

public final class b {
    public static final class a {
        private a() {
        }

        public a(g g0) {
        }
    }

    private final float a;
    private final float b;
    private final float c;
    private final int d;
    public static final a e;

    static {
        b.e = new a(null);
    }

    public b(float f, float f1, float f2, int v) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = v;
    }

    public b(BackEvent backEvent0) {
        k.e(backEvent0, "backEvent");
        this(androidx.activity.a.a.d(backEvent0), androidx.activity.a.a.e(backEvent0), androidx.activity.a.a.b(backEvent0), androidx.activity.a.a.c(backEvent0));
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    @Override
    public String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}

