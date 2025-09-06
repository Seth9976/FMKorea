package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzou implements k {
    private static zzou zza;
    private final k zzb;

    static {
        zzou.zza = new zzou();
    }

    public zzou() {
        this.zzb = l.b(new zzow());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzox)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzox)zzou.zza.get()).zza();
    }
}

