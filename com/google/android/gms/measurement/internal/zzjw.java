package com.google.android.gms.measurement.internal;

final class zzjw implements Runnable {
    private final zzay zza;
    private final zziq zzb;

    zzjw(zziq zziq0, zzay zzay0) {
        this.zzb = zziq0;
        this.zza = zzay0;
        super();
    }

    @Override
    public final void run() {
        if(this.zzb.zzk().zza(this.zza)) {
            this.zzb.zzo().zza(false);
            return;
        }
        this.zzb.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", this.zza.zza());
    }
}

