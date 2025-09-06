package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjn implements Runnable {
    private final AtomicReference zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final zziq zzf;

    zzjn(zziq zziq0, AtomicReference atomicReference0, String s, String s1, String s2, boolean z) {
        this.zzf = zziq0;
        this.zza = atomicReference0;
        this.zzb = null;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = z;
        super();
    }

    @Override
    public final void run() {
        this.zzf.zzu.zzr().zza(this.zza, null, this.zzc, this.zzd, this.zze);
    }
}

