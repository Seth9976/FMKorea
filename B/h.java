package B;

import java.util.Locale;

public abstract class h {
    public static void a(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static int c(int v, int v1, int v2, String s) {
        if(v < v1) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", s, v1, v2));
        }
        if(v > v2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", s, v1, v2));
        }
        return v;
    }

    public static int d(int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        return v;
    }

    public static int e(int v, String s) {
        if(v < 0) {
            throw new IllegalArgumentException(s);
        }
        return v;
    }

    public static int f(int v, int v1) {
        if((v & v1) != v) {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(v) + ", but only 0x" + Integer.toHexString(v1) + " are allowed");
        }
        return v;
    }

    public static Object g(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object h(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static void i(boolean z, String s) {
        if(!z) {
            throw new IllegalStateException(s);
        }
    }
}

