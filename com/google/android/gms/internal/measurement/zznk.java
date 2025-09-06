package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznk implements k {
    private static zznk zza;
    private final k zzb;

    static {
        zznk.zza = new zznk();
    }

    public zznk() {
        this.zzb = l.b(new zznm());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznn)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznn)zznk.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznn)zznk.zza.get()).zzb();
    }
}

