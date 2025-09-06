package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpg implements k {
    private static zzpg zza;
    private final k zzb;

    static {
        zzpg.zza = new zzpg();
    }

    public zzpg() {
        this.zzb = l.b(new zzpi());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpj)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpj)zzpg.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpj)zzpg.zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpj)zzpg.zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzpj)zzpg.zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpj)zzpg.zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzpj)zzpg.zza.get()).zzf();
    }
}

