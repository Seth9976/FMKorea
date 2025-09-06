package com.google.android.gms.measurement.internal;

final class zzhx implements Runnable {
    private final zzbg zza;
    private final zzo zzb;
    private final zzhj zzc;

    zzhx(zzhj zzhj0, zzbg zzbg0, zzo zzo0) {
        this.zzc = zzhj0;
        this.zza = zzbg0;
        this.zzb = zzo0;
        super();
    }

    @Override
    public final void run() {
        zzbg zzbg0 = this.zzc.zzb(this.zza, this.zzb);
        this.zzc.zzc(zzbg0, this.zzb);
    }
}

