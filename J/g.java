package J;

import I3.I;
import K.b;
import java.util.List;
import m3.o;
import y3.a;

public final class g {
    public static final g a;

    static {
        g.a = new g();
    }

    public final f a(k k0, b b0, List list0, I i0, a a0) {
        z3.k.e(k0, "serializer");
        z3.k.e(list0, "migrations");
        z3.k.e(i0, "scope");
        z3.k.e(a0, "produceFile");
        K.a a1 = new K.a();
        return new m(a0, k0, o.e(e.a.b(list0)), a1, i0);
    }
}

