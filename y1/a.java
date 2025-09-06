package Y1;

import X1.h;

public abstract class a extends b {
    public static int a(int v, int v1, int v2) {
        h.f(v1 <= v2, "min (%s) must be less than or equal to max (%s)", v1, v2);
        return Math.min(Math.max(v, v1), v2);
    }
}

