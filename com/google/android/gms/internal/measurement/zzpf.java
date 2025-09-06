package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpf implements k {
    private static zzpf zza;
    private final k zzb;

    static {
        zzpf.zza = new zzpf();
    }

    public zzpf() {
        this.zzb = l.b(new zzph());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpe)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpe)zzpf.zza.get()).zza();
    }
}

