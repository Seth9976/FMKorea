package com.google.android.gms.measurement.internal;

final class zzjd implements Runnable {
    private final long zza;
    private final zziq zzb;

    zzjd(zziq zziq0, long v) {
        this.zzb = zziq0;
        this.zza = v;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", this.zza);
    }
}

