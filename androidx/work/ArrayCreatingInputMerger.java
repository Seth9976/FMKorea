package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import z3.k;

public final class ArrayCreatingInputMerger extends h {
    @Override  // androidx.work.h
    public d b(List list0) {
        k.e(list0, "inputs");
        a d$a0 = new a();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            Map map0 = ((d)object0).j();
            k.d(map0, "input.keyValueMap");
            for(Object object1: map0.entrySet()) {
                String s = (String)((Map.Entry)object1).getKey();
                Object object2 = ((Map.Entry)object1).getValue();
                Class class0 = object2 == null ? String.class : object2.getClass();
                Object object3 = hashMap0.get(s);
                k.d(s, "key");
                if(object3 != null) {
                    Class class1 = object3.getClass();
                    if(k.a(class1, class0)) {
                        k.d(object2, "value");
                        object2 = this.d(object3, object2);
                    }
                    else {
                        if(!k.a(class1.getComponentType(), class0)) {
                            throw new IllegalArgumentException();
                        }
                        object2 = this.c(object3, object2, class0);
                    }
                }
                else if(!class0.isArray()) {
                    object2 = this.e(object2, class0);
                }
                k.d(object2, "if (existingValue == nul…      }\n                }");
                hashMap0.put(s, object2);
            }
        }
        d$a0.d(hashMap0);
        d d0 = d$a0.a();
        k.d(d0, "output.build()");
        return d0;
    }

    private final Object c(Object object0, Object object1, Class class0) {
        int v = Array.getLength(object0);
        Object object2 = Array.newInstance(class0, v + 1);
        System.arraycopy(object0, 0, object2, 0, v);
        Array.set(object2, v, object1);
        k.d(object2, "newArray");
        return object2;
    }

    private final Object d(Object object0, Object object1) {
        int v = Array.getLength(object0);
        int v1 = Array.getLength(object1);
        Class class0 = object0.getClass().getComponentType();
        k.b(class0);
        Object object2 = Array.newInstance(class0, v + v1);
        System.arraycopy(object0, 0, object2, 0, v);
        System.arraycopy(object1, 0, object2, v, v1);
        k.d(object2, "newArray");
        return object2;
    }

    private final Object e(Object object0, Class class0) {
        Object object1 = Array.newInstance(class0, 1);
        Array.set(object1, 0, object0);
        k.d(object1, "newArray");
        return object1;
    }
}

