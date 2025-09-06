package X1;

import java.util.Arrays;

public abstract class f extends b {
    // 去混淆评级： 低(20)
    public static boolean a(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static int b(Object[] arr_object) {
        return Arrays.hashCode(arr_object);
    }
}

