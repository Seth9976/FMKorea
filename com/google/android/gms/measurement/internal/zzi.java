package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

final class zzi implements Runnable {
    private final zzcv zza;
    private final AppMeasurementDynamiteService zzb;

    zzi(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcv zzcv0) {
        this.zzb = appMeasurementDynamiteService0;
        this.zza = zzcv0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}

