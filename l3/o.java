package l3;

import z3.k;

public abstract class o {
    public static final Object a(Throwable throwable0) {
        k.e(throwable0, "exception");
        return new b(throwable0);
    }

    public static final void b(Object object0) {
        if(object0 instanceof b) {
            throw ((b)object0).f;
        }
    }
}

