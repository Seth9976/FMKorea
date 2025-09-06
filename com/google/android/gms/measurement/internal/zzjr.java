package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjr implements Runnable {
    private final AtomicReference zza;
    private final zziq zzb;

    zzjr(zziq zziq0, AtomicReference atomicReference0) {
        this.zzb = zziq0;
        this.zza = atomicReference0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza) {
            try {
                Integer integer0 = this.zzb.zze().zzb(this.zzb.zzg().zzad(), zzbi.zzan);
                this.zza.set(integer0);
            }
            catch(Throwable throwable0) {
                this.zza.notify();
                throw throwable0;
            }
        }
        this.zza.notify();
    }
}

