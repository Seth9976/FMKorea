package com.google.android.gms.internal.ads;

public final class zzeff implements Runnable {
    public final zzefh zza;
    public final zzfbr zzb;
    public final zzfbe zzc;

    public zzeff(zzefh zzefh0, zzfbr zzfbr0, zzfbe zzfbe0) {
        this.zza = zzefh0;
        this.zzb = zzfbr0;
        this.zzc = zzfbe0;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}

