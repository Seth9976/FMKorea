package m3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import z3.k;

abstract class q extends p {
    public static ArrayList g(Object[] arr_object) {
        k.e(arr_object, "elements");
        return arr_object.length == 0 ? new ArrayList() : new ArrayList(new g(arr_object, true));
    }

    public static final Collection h(Object[] arr_object) {
        k.e(arr_object, "<this>");
        return new g(arr_object, false);
    }

    public static List i() {
        return A.f;
    }

    public static int j(List list0) {
        k.e(list0, "<this>");
        return list0.size() - 1;
    }

    public static List k(Object[] arr_object) {
        k.e(arr_object, "elements");
        return arr_object.length <= 0 ? o.i() : i.c(arr_object);
    }

    public static final List l(List list0) {
        k.e(list0, "<this>");
        switch(list0.size()) {
            case 0: {
                return o.i();
            }
            case 1: {
                return o.e(list0.get(0));
            }
            default: {
                return list0;
            }
        }
    }

    public static void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

