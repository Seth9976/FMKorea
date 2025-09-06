package com.google.android.gms.measurement.internal;

final class zzmb implements Runnable {
    long zza;
    long zzb;
    final zzmc zzc;

    zzmb(zzmc zzmc0, long v, long v1) {
        this.zzc = zzmc0;
        super();
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final void run() {
        this.zzc.zza.zzl().zzb(new zzme(this));
    }
}

