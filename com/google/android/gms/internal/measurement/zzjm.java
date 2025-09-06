package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzjm implements Map.Entry {
    private Map.Entry zza;

    private zzjm(Map.Entry map$Entry0) {
        this.zza = map$Entry0;
    }

    zzjm(Map.Entry map$Entry0, zzjl zzjl0) {
        this(map$Entry0);
    }

    @Override
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override
    public final Object getValue() {
        return ((zzjj)this.zza.getValue()) == null ? null : zzjj.zza();
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzkj)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzjj)this.zza.getValue()).zza(((zzkj)object0));
    }

    public final zzjj zza() {
        return (zzjj)this.zza.getValue();
    }
}

