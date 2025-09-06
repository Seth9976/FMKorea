package com.google.android.gms.internal.ads;

public final class zzow implements Runnable {
    public final zzox zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzow(zzox zzox0, int v, long v1, long v2) {
        this.zza = zzox0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}

