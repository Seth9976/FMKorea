package com.google.android.gms.measurement.internal;

final class zzln implements Runnable {
    private final zzfk zza;
    private final zzlm zzb;

    zzln(zzlm zzlm0, zzfk zzfk0) {
        this.zzb = zzlm0;
        this.zza = zzfk0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zzb) {
            zzlm.zza(this.zzb, false);
            if(!this.zzb.zza.zzah()) {
                this.zzb.zza.zzj().zzc().zza("Connected to remote service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}

