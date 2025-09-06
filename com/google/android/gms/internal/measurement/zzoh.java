package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzoh implements k {
    private static zzoh zza;
    private final k zzb;

    static {
        zzoh.zza = new zzoh();
    }

    public zzoh() {
        this.zzb = l.b(new zzoj());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzog)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzog)zzoh.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzog)zzoh.zza.get()).zzb();
    }
}

