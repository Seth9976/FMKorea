package com.google.android.gms.measurement.internal;

import Z1.a;

final class zzjc implements a {
    private final zzmh zza;
    private final zziq zzb;

    zzjc(zziq zziq0, zzmh zzmh0) {
        this.zzb = zziq0;
        this.zza = zzmh0;
        super();
    }

    @Override  // Z1.a
    public final void onFailure(Throwable throwable0) {
        this.zzb.zzt();
        zziq.zza(this.zzb, false);
        this.zzb.zzan();
        this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", throwable0);
    }

    @Override  // Z1.a
    public final void onSuccess(Object object0) {
        this.zzb.zzt();
        zziq.zza(this.zzb, false);
        this.zzb.zzan();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}

