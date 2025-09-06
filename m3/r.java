package m3;

import java.util.Collection;
import z3.k;

abstract class r extends q {
    public static int n(Iterable iterable0, int v) {
        k.e(iterable0, "<this>");
        return iterable0 instanceof Collection ? ((Collection)iterable0).size() : v;
    }
}

