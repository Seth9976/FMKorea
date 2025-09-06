package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjo implements Runnable {
    private final AtomicReference zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zziq zze;

    zzjo(zziq zziq0, AtomicReference atomicReference0, String s, String s1, String s2) {
        this.zze = zziq0;
        this.zza = atomicReference0;
        this.zzb = null;
        this.zzc = s1;
        this.zzd = s2;
        super();
    }

    @Override
    public final void run() {
        this.zze.zzu.zzr().zza(this.zza, null, this.zzc, this.zzd);
    }
}

