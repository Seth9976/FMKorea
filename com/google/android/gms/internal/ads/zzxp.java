package com.google.android.gms.internal.ads;

public final class zzxp implements Runnable {
    public final zzxq zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzxp(zzxq zzxq0, int v, long v1, long v2) {
        this.zza = zzxq0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final void run() {
        zzxq.zzb(this.zza).zzV(this.zzb, this.zzc, this.zzd);
    }
}

