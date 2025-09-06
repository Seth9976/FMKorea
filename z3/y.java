package z3;

import l3.c;
import y3.a;
import y3.l;
import y3.p;
import y3.q;
import y3.r;

public abstract class y {
    public static Object a(Object object0, int v) {
        if(object0 != null && !y.c(object0, v)) {
            y.f(object0, "kotlin.jvm.functions.Function" + v);
        }
        return object0;
    }

    public static int b(Object object0) {
        if(object0 instanceof h) {
            return ((h)object0).c();
        }
        if(object0 instanceof a) {
            return 0;
        }
        if(object0 instanceof l) {
            return 1;
        }
        if(object0 instanceof p) {
            return 2;
        }
        if(object0 instanceof q) {
            return 3;
        }
        return object0 instanceof r ? 4 : -1;
    }

    public static boolean c(Object object0, int v) {
        return object0 instanceof c && y.b(object0) == v;
    }

    // 去混淆评级： 低(20)
    private static Throwable d(Throwable throwable0) {
        return k.j(throwable0, "z3.y");
    }

    public static ClassCastException e(ClassCastException classCastException0) {
        throw (ClassCastException)y.d(classCastException0);
    }

    public static void f(Object object0, String s) {
        y.g(((object0 == null ? "null" : object0.getClass().getName()) + " cannot be cast to " + s));
    }

    public static void g(String s) {
        throw y.e(new ClassCastException(s));
    }
}

