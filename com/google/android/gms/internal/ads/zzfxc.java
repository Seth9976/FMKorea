package com.google.android.gms.internal.ads;

public final class zzfxc implements Runnable {
    public final zzfxd zza;
    public final zzfty zzb;

    public zzfxc(zzfxd zzfxd0, zzfty zzfty0) {
        this.zza = zzfxd0;
        this.zzb = zzfty0;
    }

    @Override
    public final void run() {
        this.zza.zzx(this.zzb);
    }
}

