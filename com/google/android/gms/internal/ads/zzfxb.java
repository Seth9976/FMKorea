package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzfxb implements Runnable {
    public final zzfxd zza;
    public final d zzb;
    public final int zzc;

    public zzfxb(zzfxd zzfxd0, d d0, int v) {
        this.zza = zzfxd0;
        this.zzb = d0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}

