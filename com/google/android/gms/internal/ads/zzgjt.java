package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzgjt {
    public static final zzgjt zza;
    private final Map zzb;

    static {
        zzgjt.zza = new zzgjr().zza();
    }

    zzgjt(Map map0, zzgjs zzgjs0) {
        this.zzb = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgjt ? this.zzb.equals(((zzgjt)object0).zzb) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}

