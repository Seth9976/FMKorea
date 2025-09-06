package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zznp implements k {
    private static zznp zza;
    private final k zzb;

    static {
        zznp.zza = new zznp();
    }

    public zznp() {
        this.zzb = l.b(new zznr());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzno)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzno)zznp.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzno)zznp.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzno)zznp.zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzno)zznp.zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzno)zznp.zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzno)zznp.zza.get()).zzf();
    }

    public static boolean zzg() {
        return ((zzno)zznp.zza.get()).zzg();
    }
}

