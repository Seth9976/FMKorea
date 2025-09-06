package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznw implements k {
    private static zznw zza;
    private final k zzb;

    static {
        zznw.zza = new zznw();
    }

    public zznw() {
        this.zzb = l.b(new zzny());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznz)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznz)zznw.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznz)zznw.zza.get()).zzb();
    }
}

