package com.google.android.gms.measurement.internal;

final class zzjf implements Runnable {
    private final String zza;
    private final String zzb;
    private final Object zzc;
    private final long zzd;
    private final zziq zze;

    zzjf(zziq zziq0, String s, String s1, Object object0, long v) {
        this.zze = zziq0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = object0;
        this.zzd = v;
        super();
    }

    @Override
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

