package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzji implements Runnable {
    private final AtomicReference zza;
    private final boolean zzb;
    private final zziq zzc;

    zzji(zziq zziq0, AtomicReference atomicReference0, boolean z) {
        this.zzc = zziq0;
        this.zza = atomicReference0;
        this.zzb = z;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zzo().zza(this.zza, this.zzb);
    }
}

