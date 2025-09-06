package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznv implements k {
    private static zznv zza;
    private final k zzb;

    static {
        zznv.zza = new zznv();
    }

    public zznv() {
        this.zzb = l.b(new zznx());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznu)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznu)zznv.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznu)zznv.zza.get()).zzb();
    }
}

