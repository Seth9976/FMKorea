package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzju implements Runnable {
    private final AtomicReference zza;
    private final zziq zzb;

    zzju(zziq zziq0, AtomicReference atomicReference0) {
        this.zzb = zziq0;
        this.zza = atomicReference0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Double double0 = this.zzb.zze().zza(this.zzb.zzg().zzad(), zzbi.zzao);
                this.zza.set(double0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

