package X1;

public abstract class h {
    private static String a(int v, int v1, String s) {
        if(v < 0) {
            return j.a("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return j.a("%s (%s) must be less than size (%s)", new Object[]{s, v, v1});
    }

    private static String b(int v, int v1, String s) {
        if(v < 0) {
            return j.a("%s (%s) must not be negative", new Object[]{s, v});
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("negative size: " + v1);
        }
        return j.a("%s (%s) must not be greater than size (%s)", new Object[]{s, v, v1});
    }

    private static String c(int v, int v1, int v2) {
        if(v >= 0 && v <= v2) {
            return v1 < 0 || v1 > v2 ? h.b(v1, v2, "end index") : j.a("end index (%s) must not be less than start index (%s)", new Object[]{v1, v});
        }
        return h.b(v, v2, "start index");
    }

    public static void d(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void f(boolean z, String s, int v, int v1) {
        if(!z) {
            throw new IllegalArgumentException(j.a(s, new Object[]{v, v1}));
        }
    }

    public static int g(int v, int v1) {
        return h.h(v, v1, "index");
    }

    public static int h(int v, int v1, String s) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException(h.a(v, v1, s));
        }
        return v;
    }

    public static Object i(Object object0) {
        object0.getClass();
        return object0;
    }

    public static Object j(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static int k(int v, int v1) {
        return h.l(v, v1, "index");
    }

    public static int l(int v, int v1, String s) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(h.b(v, v1, s));
        }
        return v;
    }

    public static void m(int v, int v1, int v2) {
        if(v < 0 || v1 < v || v1 > v2) {
            throw new IndexOutOfBoundsException(h.c(v, v1, v2));
        }
    }

    public static void n(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    public static void o(boolean z, String s, Object object0) {
        if(!z) {
            throw new IllegalStateException(j.a(s, new Object[]{object0}));
        }
    }
}

