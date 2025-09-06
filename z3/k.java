package z3;

import java.util.Arrays;
import l3.t;

public abstract class k {
    public static boolean a(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public static void b(Object object0) [...] // 潜在的解密器

    public static void c(Object object0, String s) {
        if(object0 == null) {
            k.m(s);
        }
    }

    public static void d(Object object0, String s) [...] // 潜在的解密器

    public static void e(Object object0, String s) {
        if(object0 == null) {
            k.n(s);
        }
    }

    public static int f(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }

    public static int g(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 == 0 ? 0 : 1;
    }

    private static String h(String s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        int v;
        for(v = 0; !arr_stackTraceElement[v].getClassName().equals("z3.k"); ++v) {
        }
        while(arr_stackTraceElement[v].getClassName().equals("z3.k")) {
            ++v;
        }
        StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
        return "Parameter specified as non-null is null: method " + stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName() + ", parameter " + s;
    }

    // 去混淆评级： 低(20)
    private static Throwable i(Throwable throwable0) {
        return k.j(throwable0, "z3.k");
    }

    static Throwable j(Throwable throwable0, String s) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = -1;
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            if(s.equals(arr_stackTraceElement[v1].getClassName())) {
                v = v1;
            }
        }
        throwable0.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement, v + 1, arr_stackTraceElement.length)));
        return throwable0;
    }

    public static String k(String s, Object object0) [...] // Inlined contents

    public static void l() {
        throw (NullPointerException)k.i(new NullPointerException());
    }

    public static void m(String s) {
        throw (NullPointerException)k.i(new NullPointerException(s));
    }

    private static void n(String s) {
        throw (NullPointerException)k.i(new NullPointerException(k.h(s)));
    }

    public static void o(String s) {
        throw (t)k.i(new t(s));
    }

    public static void p(String s) {
        k.o(("lateinit property " + s + " has not been initialized"));
    }
}

