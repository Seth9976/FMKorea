package m3;

import java.lang.reflect.Array;
import z3.k;

abstract class j {
    public static final Object[] a(Object[] arr_object, int v) {
        k.e(arr_object, "reference");
        Object object0 = Array.newInstance(arr_object.getClass().getComponentType(), v);
        k.c(object0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])object0;
    }

    public static final void b(int v, int v1) {
        if(v > v1) {
            throw new IndexOutOfBoundsException("toIndex (" + v + ") is greater than size (" + v1 + ").");
        }
    }
}

