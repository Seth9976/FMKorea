package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzoi implements k {
    private static zzoi zza;
    private final k zzb;

    static {
        zzoi.zza = new zzoi();
    }

    public zzoi() {
        this.zzb = l.b(new zzok());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzol)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzol)zzoi.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzol)zzoi.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzol)zzoi.zza.get()).zzc();
    }
}

