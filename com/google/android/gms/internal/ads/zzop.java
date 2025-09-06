package com.google.android.gms.internal.ads;

public final class zzop implements Runnable {
    public final zzox zza;
    public final zzid zzb;

    public zzop(zzox zzox0, zzid zzid0) {
        this.zza = zzox0;
        this.zzb = zzid0;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb);
    }
}

