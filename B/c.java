package B;

import java.util.Objects;

public abstract class c {
    public static boolean a(Object object0, Object object1) {
        return Objects.equals(object0, object1);
    }

    public static int b(Object[] arr_object) {
        return Objects.hash(arr_object);
    }

    public static Object c(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object d(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }
}

