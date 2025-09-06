package y0;

import java.util.WeakHashMap;

final class y {
    public static final y a;
    private static final WeakHashMap b;

    static {
        y.a = new y();
        y.b = new WeakHashMap();
    }

    public final WeakHashMap a() {
        return y.b;
    }
}

