package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

final class zzl implements Runnable {
    private final zzcv zza;
    private final String zzb;
    private final String zzc;
    private final AppMeasurementDynamiteService zzd;

    zzl(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcv zzcv0, String s, String s1) {
        this.zzd = appMeasurementDynamiteService0;
        this.zza = zzcv0;
        this.zzb = s;
        this.zzc = s1;
        super();
    }

    @Override
    public final void run() {
        this.zzd.zza.zzr().zza(this.zza, this.zzb, this.zzc);
    }
}

