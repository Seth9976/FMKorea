package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

final class zzk implements Runnable {
    private final zzcv zza;
    private final zzbg zzb;
    private final String zzc;
    private final AppMeasurementDynamiteService zzd;

    zzk(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcv zzcv0, zzbg zzbg0, String s) {
        this.zzd = appMeasurementDynamiteService0;
        this.zza = zzcv0;
        this.zzb = zzbg0;
        this.zzc = s;
        super();
    }

    @Override
    public final void run() {
        this.zzd.zza.zzr().zza(this.zza, this.zzb, this.zzc);
    }
}

