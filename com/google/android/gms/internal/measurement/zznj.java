package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznj implements k {
    private static zznj zza;
    private final k zzb;

    static {
        zznj.zza = new zznj();
    }

    public zznj() {
        this.zzb = l.b(new zznl());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzni)this.zzb.get();
    }

    public static long zza() {
        return ((zzni)zznj.zza.get()).zza();
    }
}

