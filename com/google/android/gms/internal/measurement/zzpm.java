package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpm implements k {
    private static zzpm zza;
    private final k zzb;

    static {
        zzpm.zza = new zzpm();
    }

    public zzpm() {
        this.zzb = l.b(new zzpo());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpp)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpp)zzpm.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpp)zzpm.zza.get()).zzb();
    }
}

