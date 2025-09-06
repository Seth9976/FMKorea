package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzot implements k {
    private static zzot zza;
    private final k zzb;

    static {
        zzot.zza = new zzot();
    }

    public zzot() {
        this.zzb = l.b(new zzov());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzos)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzos)zzot.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzos)zzot.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzos)zzot.zza.get()).zzc();
    }
}

