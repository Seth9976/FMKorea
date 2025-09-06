package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

abstract class zzfsx implements Map.Entry {
    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof Map.Entry && zzfrd.zza(this.getKey(), ((Map.Entry)object0).getKey()) && zzfrd.zza(this.getValue(), ((Map.Entry)object0).getValue());
    }

    @Override
    public abstract Object getKey();

    @Override
    public abstract Object getValue();

    @Override
    public final int hashCode() {
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
    public Object setValue(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

