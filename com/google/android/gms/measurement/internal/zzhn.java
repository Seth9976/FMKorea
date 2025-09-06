package com.google.android.gms.measurement.internal;

final class zzhn implements Runnable {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzhj zze;

    zzhn(zzhj zzhj0, String s, String s1, String s2, long v) {
        this.zze = zzhj0;
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = v;
        super();
    }

    @Override
    public final void run() {
        String s = this.zza;
        if(s == null) {
            this.zze.zza.zza(this.zzb, null);
            return;
        }
        zzki zzki0 = new zzki(this.zzc, s, this.zzd);
        this.zze.zza.zza(this.zzb, zzki0);
    }
}

