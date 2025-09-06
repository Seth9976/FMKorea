package com.google.android.gms.ads.internal;

public final class zzg implements Runnable {
    public final zzi zza;
    public final boolean zzb;

    public zzg(zzi zzi0, boolean z) {
        this.zza = zzi0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}

