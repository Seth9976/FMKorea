package I3;

import N3.F;
import N3.K;

public final class L0 {
    public static final L0 a;
    private static final ThreadLocal b;

    static {
        L0.a = new L0();
        L0.b = K.a(new F("ThreadLocalEventLoop"));
    }

    public final a0 a() {
        return (a0)L0.b.get();
    }

    public final a0 b() {
        ThreadLocal threadLocal0 = L0.b;
        a0 a00 = (a0)threadLocal0.get();
        if(a00 == null) {
            a00 = d0.a();
            threadLocal0.set(a00);
        }
        return a00;
    }

    public final void c() {
        L0.b.set(null);
    }

    public final void d(a0 a00) {
        L0.b.set(a00);
    }
}

