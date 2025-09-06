package r3;

import java.lang.reflect.Method;
import z3.k;

final class i {
    static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method0, Method method1, Method method2) {
            this.a = method0;
            this.b = method1;
            this.c = method2;
        }
    }

    public static final i a;
    private static final a b;
    private static a c;

    static {
        i.a = new i();
        i.b = new a(null, null, null);
    }

    private final a a(r3.a a0) {
        try {
            a i$a0 = new a(Class.class.getDeclaredMethod("getModule", null), a0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), a0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            i.c = i$a0;
            return i$a0;
        }
        catch(Exception unused_ex) {
            i.c = i.b;
            return i.b;
        }
    }

    public final String b(r3.a a0) {
        k.e(a0, "continuation");
        a i$a0 = i.c == null ? this.a(a0) : i.c;
        if(i$a0 == i.b) {
            return null;
        }
        Method method0 = i$a0.a;
        if(method0 != null) {
            Object object0 = method0.invoke(a0.getClass(), null);
            if(object0 != null) {
                Method method1 = i$a0.b;
                if(method1 != null) {
                    Object object1 = method1.invoke(object0, null);
                    if(object1 != null) {
                        Object object2 = i$a0.c == null ? null : i$a0.c.invoke(object1, null);
                        return object2 instanceof String ? ((String)object2) : null;
                    }
                }
            }
        }
        return null;
    }
}

