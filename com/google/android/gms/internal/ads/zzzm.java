package com.google.android.gms.internal.ads;

public final class zzzm implements Runnable {
    public final zzzv zza;
    public final Object zzb;
    public final long zzc;

    public zzzm(zzzv zzzv0, Object object0, long v) {
        this.zza = zzzv0;
        this.zzb = object0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}

