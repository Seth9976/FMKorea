package com.google.android.gms.measurement.internal;

final class zzkn implements Runnable {
    private final zzki zza;
    private final long zzb;
    private final zzkh zzc;

    zzkn(zzkh zzkh0, zzki zzki0, long v) {
        this.zzc = zzkh0;
        this.zza = zzki0;
        this.zzb = v;
        super();
    }

    @Override
    public final void run() {
        zzkh.zza(this.zzc, this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzo().zza(null);
    }
}

