package com.google.android.gms.internal.ads;

public final class zzzr implements Runnable {
    public final zzzv zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;

    public zzzr(zzzv zzzv0, String s, long v, long v1) {
        this.zza = zzzv0;
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final void run() {
        this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}

