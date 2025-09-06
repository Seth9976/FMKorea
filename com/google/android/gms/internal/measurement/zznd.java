package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznd implements k {
    private static zznd zza;
    private final k zzb;

    static {
        zznd.zza = new zznd();
    }

    public zznd() {
        this.zzb = l.b(new zznf());
    }

    @Override  // X1.k
    public final Object get() {
        return (zznc)this.zzb.get();
    }

    public static boolean zza() {
        return ((zznc)zznd.zza.get()).zza();
    }
}

