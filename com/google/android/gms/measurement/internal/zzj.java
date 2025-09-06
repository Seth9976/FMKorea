package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

final class zzj implements Runnable {
    private final zzcv zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final AppMeasurementDynamiteService zze;

    zzj(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcv zzcv0, String s, String s1, boolean z) {
        this.zze = appMeasurementDynamiteService0;
        this.zza = zzcv0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = z;
        super();
    }

    @Override
    public final void run() {
        this.zze.zza.zzr().zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

