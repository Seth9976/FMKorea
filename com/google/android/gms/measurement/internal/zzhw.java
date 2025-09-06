package com.google.android.gms.measurement.internal;

final class zzhw implements Runnable {
    private final zzbg zza;
    private final String zzb;
    private final zzhj zzc;

    zzhw(zzhj zzhj0, zzbg zzbg0, String s) {
        this.zzc = zzhj0;
        this.zza = zzbg0;
        this.zzb = s;
        super();
    }

    @Override
    public final void run() {
        this.zzc.zza.zzr();
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}

