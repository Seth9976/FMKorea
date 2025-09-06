package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpr implements k {
    private static zzpr zza;
    private final k zzb;

    static {
        zzpr.zza = new zzpr();
    }

    public zzpr() {
        this.zzb = l.b(new zzpt());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpq)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpq)zzpr.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpq)zzpr.zza.get()).zzb();
    }
}

