package com.google.android.gms.measurement.internal;

final class zzlz implements Runnable {
    private final long zza;
    private final zzlx zzb;

    zzlz(zzlx zzlx0, long v) {
        this.zzb = zzlx0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        zzlx.zza(this.zzb, this.zza);
    }
}

