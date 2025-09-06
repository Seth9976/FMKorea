package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzqe implements k {
    private static zzqe zza;
    private final k zzb;

    static {
        zzqe.zza = new zzqe();
    }

    public zzqe() {
        this.zzb = l.b(new zzqg());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzqh)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzqh)zzqe.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqh)zzqe.zza.get()).zzb();
    }
}

