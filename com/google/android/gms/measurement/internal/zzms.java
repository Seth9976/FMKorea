package com.google.android.gms.measurement.internal;

final class zzms implements Runnable {
    private final zzna zza;
    private final zzmp zzb;

    zzms(zzmp zzmp0, zzna zzna0) {
        this.zzb = zzmp0;
        this.zza = zzna0;
        super();
    }

    @Override
    public final void run() {
        zzmp.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}

