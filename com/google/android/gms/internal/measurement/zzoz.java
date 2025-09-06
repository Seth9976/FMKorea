package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzoz implements k {
    private static zzoz zza;
    private final k zzb;

    static {
        zzoz.zza = new zzoz();
    }

    public zzoz() {
        this.zzb = l.b(new zzpb());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzoy)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzoy)zzoz.zza.get()).zza();
    }
}

