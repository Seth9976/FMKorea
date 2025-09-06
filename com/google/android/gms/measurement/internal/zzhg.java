package com.google.android.gms.measurement.internal;

final class zzhg implements Runnable {
    private final zzio zza;
    private final zzhf zzb;

    zzhg(zzhf zzhf0, zzio zzio0) {
        this.zzb = zzhf0;
        this.zza = zzio0;
        super();
    }

    @Override
    public final void run() {
        zzhf.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}

