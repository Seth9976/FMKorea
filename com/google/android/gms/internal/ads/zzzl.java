package com.google.android.gms.internal.ads;

public final class zzzl implements Runnable {
    public final zzzv zza;
    public final int zzb;
    public final long zzc;

    public zzzl(zzzv zzzv0, int v, long v1) {
        this.zza = zzzv0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}

