package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzps implements k {
    private static zzps zza;
    private final k zzb;

    static {
        zzps.zza = new zzps();
    }

    public zzps() {
        this.zzb = l.b(new zzpu());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpv)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpv)zzps.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpv)zzps.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpv)zzps.zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzpv)zzps.zza.get()).zzd();
    }
}

