package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzmy implements k {
    private static zzmy zza;
    private final k zzb;

    static {
        zzmy.zza = new zzmy();
    }

    public zzmy() {
        this.zzb = l.b(new zzna());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznb)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznb)zzmy.zza.get()).zza();
    }
}

