package com.google.android.gms.internal.ads;

public final class zzr {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;

    public zzr() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
    }

    zzr(zzs zzs0, zzq zzq0) {
        this.zza = zzs0.zzd;
        this.zzb = zzs0.zze;
        this.zzc = zzs0.zzf;
        this.zzd = zzs0.zzg;
    }

    public final zzr zza(int v) {
        this.zzb = 1;
        return this;
    }

    public final zzr zzb(int v) {
        this.zza = 1;
        return this;
    }

    public final zzr zzc(int v) {
        this.zzc = v;
        return this;
    }

    public final zzs zzd() {
        return new zzs(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

