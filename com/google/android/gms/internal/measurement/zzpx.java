package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpx implements k {
    private static zzpx zza;
    private final k zzb;

    static {
        zzpx.zza = new zzpx();
    }

    public zzpx() {
        this.zzb = l.b(new zzpz());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpw)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpw)zzpx.zza.get()).zza();
    }
}

