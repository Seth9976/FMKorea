package I3;

import N3.F;

public abstract class y0 {
    private static final F a;
    public static final F b;
    private static final F c;
    private static final F d;
    private static final F e;
    private static final Z f;
    private static final Z g;

    static {
        y0.a = new F("COMPLETING_ALREADY");
        y0.b = new F("COMPLETING_WAITING_CHILDREN");
        y0.c = new F("COMPLETING_RETRY");
        y0.d = new F("TOO_LATE_TO_CANCEL");
        y0.e = new F("SEALED");
        y0.f = new Z(false);
        y0.g = new Z(true);
    }

    public static final F a() {
        return y0.a;
    }

    public static final F b() {
        return y0.c;
    }

    public static final Z c() {
        return y0.g;
    }

    public static final Z d() {
        return y0.f;
    }

    public static final F e() {
        return y0.e;
    }

    public static final F f() {
        return y0.d;
    }

    public static final Object g(Object object0) {
        return object0 instanceof l0 ? new m0(((l0)object0)) : object0;
    }

    public static final Object h(Object object0) {
        m0 m00 = object0 instanceof m0 ? ((m0)object0) : null;
        if(m00 != null) {
            l0 l00 = m00.a;
            if(l00 != null) {
                return l00;
            }
        }
        return object0;
    }
}

