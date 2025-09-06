package m3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z3.k;

abstract class u extends t {
    public static final void o(List list0) {
        k.e(list0, "<this>");
        if(list0.size() > 1) {
            Collections.sort(list0);
        }
    }

    public static void p(List list0, Comparator comparator0) {
        k.e(list0, "<this>");
        k.e(comparator0, "comparator");
        if(list0.size() > 1) {
            Collections.sort(list0, comparator0);
        }
    }
}

