package F3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z3.k;

abstract class n extends l {
    public static Iterable k(e e0) {
        public static final class a implements Iterable {
            final e f;

            public a(e e0) {
                this.f = e0;
                super();
            }

            @Override
            public Iterator iterator() {
                return this.f.iterator();
            }
        }

        k.e(e0, "<this>");
        return new a(e0);
    }

    public static e l(e e0, y3.l l0) {
        k.e(e0, "<this>");
        k.e(l0, "predicate");
        return new c(e0, true, l0);
    }

    public static final e m(e e0, y3.l l0) {
        k.e(e0, "<this>");
        k.e(l0, "predicate");
        return new c(e0, false, l0);
    }

    public static e n(e e0) {
        k.e(e0, "<this>");
        e e1 = n.m(e0, new m());
        k.c(e1, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return e1;
    }

    private static final boolean o(Object object0) {
        return object0 == null;
    }

    public static e p(e e0, y3.l l0) {
        k.e(e0, "<this>");
        k.e(l0, "transform");
        return new o(e0, l0);
    }

    public static List q(e e0) {
        k.e(e0, "<this>");
        Iterator iterator0 = e0.iterator();
        if(!iterator0.hasNext()) {
            return m3.o.i();
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return m3.o.e(object0);
        }
        List list0 = new ArrayList();
        ((ArrayList)list0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(object1);
        }
        return list0;
    }
}

