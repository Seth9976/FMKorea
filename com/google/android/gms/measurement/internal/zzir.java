package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class zzir implements Runnable {
    private zziq zza;
    private AtomicReference zzb;

    public zzir(zziq zziq0, AtomicReference atomicReference0) {
        this.zza = zziq0;
        this.zzb = atomicReference0;
    }

    @Override
    public final void run() {
        zziq zziq0 = this.zza;
        AtomicReference atomicReference0 = this.zzb;
        Bundle bundle0 = zziq0.zzk().zzi.zza();
        zzkp zzkp0 = zziq0.zzo();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        zzkp0.zza(atomicReference0, bundle0);
    }
}

