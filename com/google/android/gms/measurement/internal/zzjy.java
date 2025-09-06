package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

final class zzjy implements Runnable {
    private final zzih zza;
    private final long zzb;
    private final boolean zzc;
    private final zzih zzd;
    private final zziq zze;

    zzjy(zziq zziq0, zzih zzih0, long v, boolean z, zzih zzih1) {
        this.zze = zziq0;
        this.zza = zzih0;
        this.zzb = v;
        this.zzc = z;
        this.zzd = zzih1;
        super();
    }

    @Override
    public final void run() {
        this.zze.zza(this.zza);
        zziq.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        if(zzps.zza() && this.zze.zze().zza(zzbi.zzbs)) {
            zziq.zza(this.zze, this.zza, this.zzd);
        }
    }
}

