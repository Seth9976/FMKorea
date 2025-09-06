package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgak {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgnw zzd;
    private final int zze;
    private final String zzf;
    private final zzfzp zzg;
    private final int zzh;

    zzgak(Object object0, Object object1, byte[] arr_b, int v, zzgnw zzgnw0, int v1, String s, zzfzp zzfzp0) {
        this.zza = object0;
        this.zzb = object1;
        this.zzc = Arrays.copyOf(arr_b, arr_b.length);
        this.zzh = v;
        this.zzd = zzgnw0;
        this.zze = v1;
        this.zzf = s;
        this.zzg = zzfzp0;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfzp zzb() {
        return this.zzg;
    }

    public final zzgnw zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        return this.zzc == null ? null : Arrays.copyOf(this.zzc, this.zzc.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}

