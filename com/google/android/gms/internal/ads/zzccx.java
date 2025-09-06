package com.google.android.gms.internal.ads;

public final class zzccx implements Runnable {
    public final zzcdb zza;
    public final boolean zzb;
    public final long zzc;

    public zzccx(zzcdb zzcdb0, boolean z, long v) {
        this.zza = zzcdb0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzJ(this.zzb, this.zzc);
    }
}

