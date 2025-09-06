package com.google.android.gms.measurement.internal;

final class zzmm extends zzaw {
    private final zzmj zza;

    zzmm(zzmj zzmj0, zzif zzif0) {
        this.zza = zzmj0;
        super(zzif0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzaw
    public final void zzb() {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzw();
    }
}

