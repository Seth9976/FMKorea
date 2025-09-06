package com.google.android.gms.measurement.internal;

final class zzjt implements Runnable {
    private final Boolean zza;
    private final zziq zzb;

    zzjt(zziq zziq0, Boolean boolean0) {
        this.zzb = zziq0;
        this.zza = boolean0;
        super();
    }

    @Override
    public final void run() {
        zziq.zza(this.zzb, this.zza, true);
    }
}

