package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzqd implements k {
    private static zzqd zza;
    private final k zzb;

    static {
        zzqd.zza = new zzqd();
    }

    public zzqd() {
        this.zzb = l.b(new zzqf());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzqc)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzqc)zzqd.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqc)zzqd.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqc)zzqd.zza.get()).zzc();
    }
}

