package com.google.android.gms.measurement.internal;

final class zzkm implements Runnable {
    private final zzki zza;
    private final zzki zzb;
    private final long zzc;
    private final boolean zzd;
    private final zzkh zze;

    zzkm(zzkh zzkh0, zzki zzki0, zzki zzki1, long v, boolean z) {
        this.zze = zzkh0;
        this.zza = zzki0;
        this.zzb = zzki1;
        this.zzc = v;
        this.zzd = z;
        super();
    }

    @Override
    public final void run() {
        zzkh.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

