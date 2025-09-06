package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzob implements k {
    private static zzob zza;
    private final k zzb;

    static {
        zzob.zza = new zzob();
    }

    public zzob() {
        this.zzb = l.b(new zzod());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzoa)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzoa)zzob.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoa)zzob.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzoa)zzob.zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzoa)zzob.zza.get()).zzd();
    }
}

