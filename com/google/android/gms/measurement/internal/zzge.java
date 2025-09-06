package com.google.android.gms.measurement.internal;

final class zzge implements Runnable {
    private final boolean zza;
    private final zzgb zzb;

    zzge(zzgb zzgb0, boolean z) {
        this.zzb = zzgb0;
        this.zza = z;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzb.zza(this.zza);
    }
}

