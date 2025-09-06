package com.google.android.gms.internal.ads;

final class zzala implements Runnable {
    final zzalp zza;
    final zzalb zzb;

    zzala(zzalb zzalb0, zzalp zzalp0) {
        this.zzb = zzalb0;
        this.zza = zzalp0;
        super();
    }

    @Override
    public final void run() {
        try {
            zzalb.zza(this.zzb).put(this.zza);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }
}

