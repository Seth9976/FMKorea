package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdg {
    public static final zzn zza;
    public final int zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final String zzf;
    private final zzcy zzg;
    private final int[] zzh;
    private final boolean[] zzi;

    static {
        zzdg.zzc = "0";
        zzdg.zzd = "1";
        zzdg.zze = "3";
        zzdg.zzf = "4";
        zzdg.zza = zzdf.zza;
    }

    public zzdg(zzcy zzcy0, boolean z, int[] arr_v, boolean[] arr_z) {
        this.zzb = 1;
        this.zzg = zzcy0;
        this.zzh = (int[])arr_v.clone();
        this.zzi = (boolean[])arr_z.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzdg.class == class0 && this.zzg.equals(((zzdg)object0).zzg) && Arrays.equals(this.zzh, ((zzdg)object0).zzh) && Arrays.equals(this.zzi, ((zzdg)object0).zzi);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzh);
        int v1 = Arrays.hashCode(this.zzi);
        return (this.zzg.hashCode() * 961 + v) * 0x1F + v1;
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int v) {
        return this.zzg.zzb(v);
    }

    public final boolean zzc() {
        boolean[] arr_z = this.zzi;
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int v) {
        return this.zzi[v];
    }
}

