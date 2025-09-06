package com.google.android.gms.measurement.internal;

final class zzhp implements Runnable {
    private final zzad zza;
    private final zzhj zzb;

    zzhp(zzhj zzhj0, zzad zzad0) {
        this.zzb = zzhj0;
        this.zza = zzad0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr();
        if(this.zza.zzc.zza() == null) {
            this.zzb.zza.zza(this.zza);
            return;
        }
        this.zzb.zza.zzb(this.zza);
    }
}

