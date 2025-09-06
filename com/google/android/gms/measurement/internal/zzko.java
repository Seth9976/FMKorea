package com.google.android.gms.measurement.internal;

final class zzko implements Runnable {
    private final long zza;
    private final zzkh zzb;

    zzko(zzkh zzkh0, long v) {
        this.zzb = zzkh0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}

