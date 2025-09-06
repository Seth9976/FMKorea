package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzqj implements k {
    private static zzqj zza;
    private final k zzb;

    static {
        zzqj.zza = new zzqj();
    }

    public zzqj() {
        this.zzb = l.b(new zzql());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzqi)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzqi)zzqj.zza.get()).zza();
    }
}

