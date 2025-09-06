package com.google.android.gms.internal.ads;

public final class zzceb implements Runnable {
    public final zzccj zza;
    public final boolean zzb;
    public final long zzc;

    public zzceb(zzccj zzccj0, boolean z, long v) {
        this.zza = zzccj0;
        this.zzb = z;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzv(this.zzb, this.zzc);
    }
}

