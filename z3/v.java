package z3;

import E3.b;
import E3.c;
import E3.d;
import E3.e;
import E3.f;

public abstract class v {
    private static final w a;
    private static final b[] b;

    static {
        w w0 = null;
        try {
            w0 = (w)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch(ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException unused_ex) {
        }
        if(w0 == null) {
            w0 = new w();
        }
        v.a = w0;
        v.b = new b[0];
    }

    public static d a(i i0) {
        return i0;
    }

    public static b b(Class class0) {
        return v.a.b(class0);
    }

    public static c c(Class class0) {
        return v.a.c(class0, "");
    }

    public static e d(n n0) {
        return n0;
    }

    public static f e(p p0) {
        return p0;
    }

    public static String f(h h0) {
        return v.a.f(h0);
    }

    public static String g(l l0) {
        return v.a.g(l0);
    }
}

