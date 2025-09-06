package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzja implements Runnable {
    private final AtomicReference zza;
    private final zziq zzb;

    zzja(zziq zziq0, AtomicReference atomicReference0) {
        this.zzb = zziq0;
        this.zza = atomicReference0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Boolean boolean0 = Boolean.valueOf(this.zzb.zze().zzj(this.zzb.zzg().zzad()));
                this.zza.set(boolean0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

