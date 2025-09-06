package com.google.android.gms.internal.ads;

public final class zzccp implements Runnable {
    public final zzcdb zza;
    public final int zzb;
    public final int zzc;

    public zzccp(zzcdb zzcdb0, int v, int v1) {
        this.zza = zzcdb0;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final void run() {
        this.zza.zzO(this.zzb, this.zzc);
    }
}

