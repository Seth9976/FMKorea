package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjk implements Runnable {
    private final long zza;
    private final zziq zzb;

    zzjk(zziq zziq0, long v) {
        this.zzb = zziq0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza(this.zza, true);
        this.zzb.zzo().zza(new AtomicReference());
    }
}

