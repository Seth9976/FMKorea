package com.google.android.gms.internal.ads;

public final class zzclq implements Runnable {
    public final zzcls zza;
    public final Runnable zzb;

    public zzclq(zzcls zzcls0, Runnable runnable0) {
        this.zza = zzcls0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        zzclr zzclr0 = new zzclr(this.zza, this.zzb);
        zzcan.zze.execute(zzclr0);
    }
}

