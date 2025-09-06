package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpa implements k {
    private static zzpa zza;
    private final k zzb;

    static {
        zzpa.zza = new zzpa();
    }

    public zzpa() {
        this.zzb = l.b(new zzpc());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpd)this.zzb.get();
    }

    public static double zza() {
        return ((zzpd)zzpa.zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpd)zzpa.zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpd)zzpa.zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpd)zzpa.zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpd)zzpa.zza.get()).zze();
    }
}

