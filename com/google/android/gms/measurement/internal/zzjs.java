package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjs implements Runnable {
    private final AtomicReference zza;
    private final zziq zzb;

    zzjs(zziq zziq0, AtomicReference atomicReference0) {
        this.zzb = zziq0;
        this.zza = atomicReference0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Long long0 = this.zzb.zze().zzc(this.zzb.zzg().zzad(), zzbi.zzam);
                this.zza.set(long0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

