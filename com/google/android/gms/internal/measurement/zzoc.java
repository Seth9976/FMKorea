package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzoc implements k {
    private static zzoc zza;
    private final k zzb;

    static {
        zzoc.zza = new zzoc();
    }

    public zzoc() {
        this.zzb = l.b(new zzoe());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzof)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzof)zzoc.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzof)zzoc.zza.get()).zzb();
    }
}

