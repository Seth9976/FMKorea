package d2;

import B2.a;
import B2.b;
import java.util.Set;

public abstract class d {
    public static Object a(e e0, F f0) {
        b b0 = e0.b(f0);
        return b0 == null ? null : b0.get();
    }

    public static Object b(e e0, Class class0) {
        return e0.g(F.b(class0));
    }

    public static a c(e e0, Class class0) {
        return e0.e(F.b(class0));
    }

    public static b d(e e0, Class class0) {
        return e0.b(F.b(class0));
    }

    public static Set e(e e0, F f0) {
        return (Set)e0.f(f0).get();
    }

    public static Set f(e e0, Class class0) {
        return e0.h(F.b(class0));
    }
}

