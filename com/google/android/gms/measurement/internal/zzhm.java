package com.google.android.gms.measurement.internal;

final class zzhm implements Runnable {
    private final zzad zza;
    private final zzo zzb;
    private final zzhj zzc;

    zzhm(zzhj zzhj0, zzad zzad0, zzo zzo0) {
        this.zzc = zzhj0;
        this.zza = zzad0;
        this.zzb = zzo0;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        if(this.zza.zzc.zza() == null) {
            this.zzc.zza.zza(this.zza, this.zzb);
            return;
        }
        this.zzc.zza.zzb(this.zza, this.zzb);
    }
}

