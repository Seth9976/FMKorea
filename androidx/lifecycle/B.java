package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class b {
    static class a {
        final Map a;
        final Map b;

        a(Map map0) {
            this.b = map0;
            this.a = new HashMap();
            for(Object object0: map0.entrySet()) {
                androidx.lifecycle.h.a h$a0 = (androidx.lifecycle.h.a)((Map.Entry)object0).getValue();
                List list0 = (List)this.a.get(h$a0);
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.a.put(h$a0, list0);
                }
                list0.add(((androidx.lifecycle.b.b)((Map.Entry)object0).getKey()));
            }
        }

        void a(n n0, androidx.lifecycle.h.a h$a0, Object object0) {
            a.b(((List)this.a.get(h$a0)), n0, h$a0, object0);
            a.b(((List)this.a.get(androidx.lifecycle.h.a.ON_ANY)), n0, h$a0, object0);
        }

        private static void b(List list0, n n0, androidx.lifecycle.h.a h$a0, Object object0) {
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((androidx.lifecycle.b.b)list0.get(v)).a(n0, h$a0, object0);
                }
            }
        }
    }

    static final class androidx.lifecycle.b.b {
        final int a;
        final Method b;

        androidx.lifecycle.b.b(int v, Method method0) {
            this.a = v;
            this.b = method0;
            method0.setAccessible(true);
        }

        void a(n n0, androidx.lifecycle.h.a h$a0, Object object0) {
            try {
                switch(this.a) {
                    case 0: {
                        this.b.invoke(object0, null);
                        return;
                    }
                    case 1: {
                        this.b.invoke(object0, n0);
                        return;
                    }
                    case 2: {
                        this.b.invoke(object0, n0, h$a0);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch(InvocationTargetException invocationTargetException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException(illegalAccessException0);
            }
            throw new RuntimeException("Failed to call observer method", invocationTargetException0.getCause());
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof androidx.lifecycle.b.b ? this.a == ((androidx.lifecycle.b.b)object0).a && this.b.getName().equals(((androidx.lifecycle.b.b)object0).b.getName()) : false;
        }

        @Override
        public int hashCode() {
            int v = this.b.getName().hashCode();
            return this.a * 0x1F + v;
        }
    }

    private final Map a;
    private final Map b;
    static b c;

    static {
        b.c = new b();
    }

    b() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    private a a(Class class0, Method[] arr_method) {
        int v2;
        Class class1 = class0.getSuperclass();
        HashMap hashMap0 = new HashMap();
        if(class1 != null) {
            a b$a0 = this.c(class1);
            if(b$a0 != null) {
                hashMap0.putAll(b$a0.b);
            }
        }
        Class[] arr_class = class0.getInterfaces();
        for(int v = 0; v < arr_class.length; ++v) {
            for(Object object0: this.c(arr_class[v]).b.entrySet()) {
                this.e(hashMap0, ((androidx.lifecycle.b.b)((Map.Entry)object0).getKey()), ((androidx.lifecycle.h.a)((Map.Entry)object0).getValue()), class0);
            }
        }
        if(arr_method == null) {
            arr_method = this.b(class0);
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_method.length; ++v1) {
            Method method0 = arr_method[v1];
            u u0 = (u)method0.getAnnotation(u.class);
            if(u0 != null) {
                Class[] arr_class1 = method0.getParameterTypes();
                if(arr_class1.length > 0) {
                    if(!n.class.isAssignableFrom(arr_class1[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    v2 = 1;
                }
                else {
                    v2 = 0;
                }
                androidx.lifecycle.h.a h$a0 = u0.value();
                if(arr_class1.length > 1) {
                    if(!androidx.lifecycle.h.a.class.isAssignableFrom(arr_class1[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if(h$a0 != androidx.lifecycle.h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    v2 = 2;
                }
                if(arr_class1.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                this.e(hashMap0, new androidx.lifecycle.b.b(v2, method0), h$a0, class0);
                z = true;
            }
        }
        a b$a1 = new a(hashMap0);
        this.a.put(class0, b$a1);
        this.b.put(class0, Boolean.valueOf(z));
        return b$a1;
    }

    private Method[] b(Class class0) {
        try {
            return class0.getDeclaredMethods();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError0);
        }
    }

    a c(Class class0) {
        a b$a0 = (a)this.a.get(class0);
        return b$a0 == null ? this.a(class0, null) : b$a0;
    }

    boolean d(Class class0) {
        Boolean boolean0 = (Boolean)this.b.get(class0);
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        Method[] arr_method = this.b(class0);
        for(int v = 0; v < arr_method.length; ++v) {
            if(((u)arr_method[v].getAnnotation(u.class)) != null) {
                this.a(class0, arr_method);
                return true;
            }
        }
        this.b.put(class0, Boolean.FALSE);
        return false;
    }

    private void e(Map map0, androidx.lifecycle.b.b b$b0, androidx.lifecycle.h.a h$a0, Class class0) {
        androidx.lifecycle.h.a h$a1 = (androidx.lifecycle.h.a)map0.get(b$b0);
        if(h$a1 != null && h$a0 != h$a1) {
            throw new IllegalArgumentException("Method " + b$b0.b.getName() + " in " + class0.getName() + " already declared with different @OnLifecycleEvent value: previous value " + h$a1 + ", new value " + h$a0);
        }
        if(h$a1 == null) {
            map0.put(b$b0, h$a0);
        }
    }
}

