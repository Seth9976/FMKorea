package com.google.android.gms.internal.ads;

public final class zzov implements Runnable {
    public final zzox zza;
    public final zzam zzb;
    public final zzie zzc;

    public zzov(zzox zzox0, zzam zzam0, zzie zzie0) {
        this.zza = zzox0;
        this.zzb = zzam0;
        this.zzc = zzie0;
    }

    @Override
    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}

