package com.google.android.gms.internal.ads;

public final class zzcrj implements Runnable {
    public final zzcrk zza;
    public final Runnable zzb;

    public zzcrj(zzcrk zzcrk0, Runnable runnable0) {
        this.zza = zzcrk0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzk(this.zzb);
    }
}

