package m3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

abstract class l extends k {
    public static List c(Object[] arr_object) {
        z3.k.e(arr_object, "<this>");
        List list0 = n.a(arr_object);
        z3.k.d(list0, "asList(...)");
        return list0;
    }

    public static Object[] d(Object[] arr_object, Object[] arr_object1, int v, int v1, int v2) {
        z3.k.e(arr_object, "<this>");
        z3.k.e(arr_object1, "destination");
        System.arraycopy(arr_object, v1, arr_object1, v, v2 - v1);
        return arr_object1;
    }

    public static Object[] e(Object[] arr_object, Object[] arr_object1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_object.length;
        }
        return i.d(arr_object, arr_object1, v, v1, v2);
    }

    public static Object[] f(Object[] arr_object, int v, int v1) {
        z3.k.e(arr_object, "<this>");
        j.b(v1, arr_object.length);
        Object[] arr_object1 = Arrays.copyOfRange(arr_object, v, v1);
        z3.k.d(arr_object1, "copyOfRange(...)");
        return arr_object1;
    }

    public static final void g(Object[] arr_object, Object object0, int v, int v1) {
        z3.k.e(arr_object, "<this>");
        Arrays.fill(arr_object, v, v1, object0);
    }

    public static final void h(Object[] arr_object) {
        z3.k.e(arr_object, "<this>");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object);
        }
    }

    public static final void i(Object[] arr_object, Comparator comparator0) {
        z3.k.e(arr_object, "<this>");
        z3.k.e(comparator0, "comparator");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object, comparator0);
        }
    }
}

