package com.google.android.gms.internal.ads;

public final class zzzq implements Runnable {
    public final zzzv zza;
    public final zzid zzb;

    public zzzq(zzzv zzzv0, zzid zzid0) {
        this.zza = zzzv0;
        this.zzb = zzid0;
    }

    @Override
    public final void run() {
        this.zza.zzi(this.zzb);
    }
}

