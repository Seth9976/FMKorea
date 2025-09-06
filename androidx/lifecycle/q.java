package androidx.lifecycle;

import G3.h;
import androidx.appcompat.app.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m3.o;
import z3.k;

public final class q {
    public static final q a;
    private static final Map b;
    private static final Map c;

    static {
        q.a = new q();
        q.b = new HashMap();
        q.c = new HashMap();
    }

    private final f a(Constructor constructor0, Object object0) {
        try {
            Object object1 = constructor0.newInstance(object0);
            k.d(object1, "{\n            constructo…tance(`object`)\n        }");
            E.a(object1);
            return null;
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }

    private final Constructor b(Class class0) {
        try {
            Package package0 = class0.getPackage();
            String s = class0.getCanonicalName();
            String s1 = package0 == null ? "" : package0.getName();
            k.d(s1, "fullPackage");
            if(s1.length() != 0) {
                k.d(s, "name");
                s = s.substring(s1.length() + 1);
                k.d(s, "this as java.lang.String).substring(startIndex)");
            }
            k.d(s, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String s2 = q.c(s);
            if(s1.length() != 0) {
                s2 = s1 + '.' + s2;
            }
            Class class1 = Class.forName(s2);
            k.c(class1, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor constructor0 = class1.getDeclaredConstructor(class0);
            if(!constructor0.isAccessible()) {
                constructor0.setAccessible(true);
                return constructor0;
            }
            return constructor0;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        return null;
    }

    public static final String c(String s) {
        k.e(s, "className");
        return h.s(s, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class class0) {
        Map map0 = q.b;
        Integer integer0 = (Integer)map0.get(class0);
        if(integer0 != null) {
            return (int)integer0;
        }
        int v = this.g(class0);
        map0.put(class0, v);
        return v;
    }

    private final boolean e(Class class0) {
        return class0 != null && m.class.isAssignableFrom(class0);
    }

    public static final l f(Object object0) {
        k.e(object0, "object");
        if(object0 instanceof l && object0 instanceof d) {
            return new DefaultLifecycleObserverAdapter(((d)object0), ((l)object0));
        }
        if(object0 instanceof d) {
            return new DefaultLifecycleObserverAdapter(((d)object0), null);
        }
        if(object0 instanceof l) {
            return (l)object0;
        }
        Class class0 = object0.getClass();
        q q0 = q.a;
        if(q0.d(class0) == 2) {
            Object object1 = q.c.get(class0);
            k.b(object1);
            if(((List)object1).size() == 1) {
                q0.a(((Constructor)((List)object1).get(0)), object0);
                return new SingleGeneratedAdapterObserver(null);
            }
            int v1 = ((List)object1).size();
            f[] arr_f = new f[v1];
            for(int v = 0; v < v1; ++v) {
                Constructor constructor0 = (Constructor)((List)object1).get(v);
                q.a.a(constructor0, object0);
                arr_f[v] = null;
            }
            return new CompositeGeneratedAdaptersObserver(arr_f);
        }
        return new ReflectiveGenericLifecycleObserver(object0);
    }

    private final int g(Class class0) {
        ArrayList arrayList0;
        if(class0.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructor0 = this.b(class0);
        if(constructor0 != null) {
            List list0 = o.e(constructor0);
            q.c.put(class0, list0);
            return 2;
        }
        if(b.c.d(class0)) {
            return 1;
        }
        Class class1 = class0.getSuperclass();
        if(this.e(class1)) {
            k.d(class1, "superclass");
            if(this.d(class1) == 1) {
                return 1;
            }
            Object object0 = q.c.get(class1);
            k.b(object0);
            arrayList0 = new ArrayList(((Collection)object0));
        }
        else {
            arrayList0 = null;
        }
        Class[] arr_class = class0.getInterfaces();
        k.d(arr_class, "klass.interfaces");
        for(int v = 0; v < arr_class.length; ++v) {
            Class class2 = arr_class[v];
            if(this.e(class2)) {
                k.d(class2, "intrface");
                if(this.d(class2) == 1) {
                    return 1;
                }
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                Object object1 = q.c.get(class2);
                k.b(object1);
                arrayList0.addAll(((Collection)object1));
            }
        }
        if(arrayList0 != null) {
            q.c.put(class0, arrayList0);
            return 2;
        }
        return 1;
    }
}

