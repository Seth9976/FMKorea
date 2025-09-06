package t3;

import B3.b;
import B3.c;
import java.lang.reflect.Method;
import m3.i;
import z3.k;

public abstract class a {
    static final class t3.a.a {
        public static final t3.a.a a;
        public static final Method b;
        public static final Method c;

        static {
            Method method1;
            Method method0;
            t3.a.a.a = new t3.a.a();
            Class class0 = Throwable.class;
            Method[] arr_method = class0.getMethods();
            k.b(arr_method);
            for(int v1 = 0; true; ++v1) {
                method0 = null;
                method1 = null;
                if(v1 >= arr_method.length) {
                    break;
                }
                method0 = arr_method[v1];
                if(k.a(method0.getName(), "addSuppressed")) {
                    Class[] arr_class = method0.getParameterTypes();
                    k.d(arr_class, "getParameterTypes(...)");
                    if(!k.a(i.u(arr_class), class0)) {
                        continue;
                    }
                    break;
                }
            }
            t3.a.a.b = method0;
            for(int v = 0; v < arr_method.length; ++v) {
                Method method2 = arr_method[v];
                if(k.a(method2.getName(), "getSuppressed")) {
                    method1 = method2;
                    break;
                }
            }
            t3.a.a.c = method1;
        }
    }

    public void a(Throwable throwable0, Throwable throwable1) {
        k.e(throwable0, "cause");
        k.e(throwable1, "exception");
        Method method0 = t3.a.a.b;
        if(method0 != null) {
            method0.invoke(throwable0, throwable1);
        }
    }

    public c b() {
        return new b();
    }
}

