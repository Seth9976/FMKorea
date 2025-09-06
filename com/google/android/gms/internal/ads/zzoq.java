package com.google.android.gms.internal.ads;

public final class zzoq implements Runnable {
    public final zzox zza;
    public final long zzb;

    public zzoq(zzox zzox0, long v) {
        this.zza = zzox0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

