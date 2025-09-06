package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzlq implements Runnable {
    private final zzlm zza;

    zzlq(zzlm zzlm0) {
        this.zza = zzlm0;
        super();
    }

    @Override
    public final void run() {
        ComponentName componentName0 = new ComponentName(this.zza.zza.zza(), "com.google.android.gms.measurement.AppMeasurementService");
        zzkp.zza(this.zza.zza, componentName0);
    }
}

