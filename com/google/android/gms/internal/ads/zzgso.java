package com.google.android.gms.internal.ads;

import java.util.List;

abstract class zzgso {
    private static final zzgso zza;
    private static final zzgso zzb;

    static {
        zzgso.zza = new zzgsk(null);
        zzgso.zzb = new zzgsm(null);
    }

    zzgso(zzgsn zzgsn0) {
    }

    abstract List zza(Object arg1, long arg2);

    abstract void zzb(Object arg1, long arg2);

    abstract void zzc(Object arg1, Object arg2, long arg3);

    static zzgso zzd() {
        return zzgso.zza;
    }

    static zzgso zze() {
        return zzgso.zzb;
    }
}

