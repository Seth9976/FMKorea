package F3;

import java.util.Iterator;
import m3.z;
import y3.l;

abstract class k extends h {
    public static Object a(Object object0) {
        return object0;
    }

    public static e c(Iterator iterator0) {
        public static final class a implements e {
            final Iterator a;

            public a(Iterator iterator0) {
                this.a = iterator0;
                super();
            }

            @Override  // F3.e
            public Iterator iterator() {
                return this.a;
            }
        }

        z3.k.e(iterator0, "<this>");
        return k.d(new a(iterator0));
    }

    public static final e d(e e0) {
        z3.k.e(e0, "<this>");
        return !(e0 instanceof F3.a) ? new F3.a(e0) : e0;
    }

    public static e e() {
        return () -> z.f;
    }

    private static final e f(e e0, l l0) {
        return e0 instanceof o ? ((o)e0).c(l0) : new d(e0, new j(), l0);
    }

    private static final Iterator g(Iterable iterable0) {
        z3.k.e(iterable0, "it");
        return iterable0.iterator();
    }

    private static final Object h(Object object0) [...] // Inlined contents

    public static e i(e e0) {
        z3.k.e(e0, "<this>");
        return k.f(e0, new i());
    }
}

