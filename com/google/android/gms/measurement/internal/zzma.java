package com.google.android.gms.measurement.internal;

final class zzma implements Runnable {
    private final long zza;
    private final zzlx zzb;

    zzma(zzlx zzlx0, long v) {
        this.zzb = zzlx0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        zzlx.zzb(this.zzb, this.zza);
    }
}

