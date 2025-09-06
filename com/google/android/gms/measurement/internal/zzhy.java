package com.google.android.gms.measurement.internal;

final class zzhy implements Runnable {
    private final zznc zza;
    private final zzo zzb;
    private final zzhj zzc;

    zzhy(zzhj zzhj0, zznc zznc0, zzo zzo0) {
        this.zzc = zzhj0;
        this.zza = zznc0;
        this.zzb = zzo0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        if(this.zza.zza() == null) {
            this.zzc.zza.zza(this.zza.zza, this.zzb);
            return;
        }
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}

