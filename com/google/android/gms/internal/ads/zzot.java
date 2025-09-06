package com.google.android.gms.internal.ads;

public final class zzot implements Runnable {
    public final zzox zza;
    public final Exception zzb;

    public zzot(zzox zzox0, Exception exception0) {
        this.zza = zzox0;
        this.zzb = exception0;
    }

    @Override
    public final void run() {
        this.zza.zzi(this.zzb);
    }
}

