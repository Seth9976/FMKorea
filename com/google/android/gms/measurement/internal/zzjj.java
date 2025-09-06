package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjj implements Runnable {
    private final AtomicReference zza;
    private final zziq zzb;

    zzjj(zziq zziq0, AtomicReference atomicReference0) {
        this.zzb = zziq0;
        this.zza = atomicReference0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                String s = this.zzb.zze().zzh(this.zzb.zzg().zzad());
                this.zza.set(s);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

