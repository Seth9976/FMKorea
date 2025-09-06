package com.google.android.gms.internal.ads;

public final class zzos implements Runnable {
    public final zzox zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;

    public zzos(zzox zzox0, String s, long v, long v1) {
        this.zza = zzox0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd);
    }
}

