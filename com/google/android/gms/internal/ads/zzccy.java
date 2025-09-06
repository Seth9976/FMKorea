package com.google.android.gms.internal.ads;

public final class zzccy implements Runnable {
    public final zzcdb zza;
    public final int zzb;

    public zzccy(zzcdb zzcdb0, int v) {
        this.zza = zzcdb0;
        this.zzb = v;
    }

    @Override
    public final void run() {
        this.zza.zzQ(this.zzb);
    }
}

