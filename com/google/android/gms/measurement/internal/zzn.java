package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

final class zzn implements Runnable {
    private final zzcv zza;
    private final AppMeasurementDynamiteService zzb;

    zzn(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzcv zzcv0) {
        this.zzb = appMeasurementDynamiteService0;
        this.zza = zzcv0;
        super();
    }

    @Override
    public final void run() {
        zznd zznd0 = this.zzb.zza.zzt();
        boolean z = this.zzb.zza.zzab();
        zznd0.zza(this.zza, z);
    }
}

