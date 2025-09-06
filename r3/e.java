package R3;

import N3.F;
import N3.I;

public abstract class e {
    private static final int a;
    private static final F b;
    private static final F c;
    private static final F d;
    private static final F e;
    private static final int f;

    static {
        e.a = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        e.b = new F("PERMIT");
        e.c = new F("TAKEN");
        e.d = new F("BROKEN");
        e.e = new F("CANCELLED");
        e.f = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }

    public static final f a(long v, f f0) {
        return e.h(v, f0);
    }

    public static final int d() [...] // 潜在的解密器

    public static final int f() [...] // 潜在的解密器

    private static final f h(long v, f f0) {
        return new f(v, f0, 0);
    }
}

