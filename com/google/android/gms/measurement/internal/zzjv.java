package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

final class zzjv implements Runnable {
    private final zzih zza;
    private final long zzb;
    private final long zzc;
    private final boolean zzd;
    private final zzih zze;
    private final zziq zzf;

    zzjv(zziq zziq0, zzih zzih0, long v, long v1, boolean z, zzih zzih1) {
        this.zzf = zziq0;
        this.zza = zzih0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = zzih1;
        super();
    }

    @Override
    public final void run() {
        this.zzf.zza(this.zza);
        this.zzf.zza(this.zzb, false);
        zziq.zza(this.zzf, this.zza, this.zzc, true, this.zzd);
        if(zzps.zza() && this.zzf.zze().zza(zzbi.zzbs)) {
            zziq.zza(this.zzf, this.zza, this.zze);
        }
    }
}

