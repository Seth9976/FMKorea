package com.google.android.gms.internal.ads;

public final class zzclr implements Runnable {
    public final zzcls zza;
    public final Runnable zzb;

    public zzclr(zzcls zzcls0, Runnable runnable0) {
        this.zza = zzcls0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

