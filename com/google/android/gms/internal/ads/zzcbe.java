package com.google.android.gms.internal.ads;

public final class zzcbe implements Runnable {
    public final zzcbn zza;
    public final int zzb;

    public zzcbe(zzcbn zzcbn0, int v) {
        this.zza = zzcbn0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb);
    }
}

