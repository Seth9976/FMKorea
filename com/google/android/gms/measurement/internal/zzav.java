package com.google.android.gms.measurement.internal;

final class zzav implements Runnable {
    private final zzif zza;
    private final zzaw zzb;

    zzav(zzaw zzaw0, zzif zzif0) {
        this.zzb = zzaw0;
        this.zza = zzif0;
        super();
    }

    @Override
    public final void run() {
        this.zza.zzd();
        if(zzae.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean z = this.zzb.zzc();
        zzaw.zza(this.zzb, 0L);
        if(z) {
            this.zzb.zzb();
        }
    }
}

