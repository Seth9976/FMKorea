package com.google.android.gms.internal.ads;

public final class zzor implements Runnable {
    public final zzox zza;
    public final boolean zzb;

    public zzor(zzox zzox0, boolean z) {
        this.zza = zzox0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzp(this.zzb);
    }
}

