package m3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n3.b;
import z3.k;

abstract class p {
    public static List a(List list0) {
        k.e(list0, "builder");
        return ((b)list0).s();
    }

    public static final Object[] b(Object[] arr_object, boolean z) {
        k.e(arr_object, "<this>");
        Class class0 = Object[].class;
        if(!z || !k.a(arr_object.getClass(), class0)) {
            arr_object = Arrays.copyOf(arr_object, arr_object.length, class0);
            k.d(arr_object, "copyOf(...)");
        }
        return arr_object;
    }

    public static List c() {
        return new b(0, 1, null);
    }

    public static List d(int v) {
        return new b(v);
    }

    public static List e(Object object0) {
        List list0 = Collections.singletonList(object0);
        k.d(list0, "singletonList(...)");
        return list0;
    }

    public static Object[] f(int v, Object[] arr_object) {
        k.e(arr_object, "array");
        if(v < arr_object.length) {
            arr_object[v] = null;
        }
        return arr_object;
    }
}

