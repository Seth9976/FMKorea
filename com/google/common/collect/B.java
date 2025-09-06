package com.google.common.collect;

import X1.f;
import java.util.Map.Entry;

abstract class b implements Map.Entry {
    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Map.Entry && f.a(this.getKey(), ((Map.Entry)object0).getKey()) && f.a(this.getValue(), ((Map.Entry)object0).getValue());
    }

    @Override
    public abstract Object getKey();

    @Override
    public abstract Object getValue();

    @Override
    public int hashCode() {
        Object object0 = this.getKey();
        Object object1 = this.getValue();
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

