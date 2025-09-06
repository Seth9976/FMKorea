package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzqk implements k {
    private static zzqk zza;
    private final k zzb;

    static {
        zzqk.zza = new zzqk();
    }

    public zzqk() {
        this.zzb = l.b(new zzqm());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzqn)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzqn)zzqk.zza.get()).zza();
    }
}

