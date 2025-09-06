package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

public final class zzcgx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgx(int v, int v1, int v2) {
        this.zzc = v;
        this.zzb = v1;
        this.zza = v2;
    }

    public static zzcgx zza() {
        return new zzcgx(0, 0, 0);
    }

    public static zzcgx zzb(int v, int v1) {
        return new zzcgx(1, v, v1);
    }

    public static zzcgx zzc(zzq zzq0) {
        if(zzq0.zzd) {
            return new zzcgx(3, 0, 0);
        }
        if(zzq0.zzi) {
            return new zzcgx(2, 0, 0);
        }
        return zzq0.zzh ? zzcgx.zza() : zzcgx.zzb(zzq0.zzf, zzq0.zzc);
    }

    public static zzcgx zzd() {
        return new zzcgx(5, 0, 0);
    }

    public static zzcgx zze() {
        return new zzcgx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}

