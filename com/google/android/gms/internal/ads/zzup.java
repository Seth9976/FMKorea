package com.google.android.gms.internal.ads;

public final class zzup implements Runnable {
    public final zzuv zza;
    public final zzaca zzb;

    public zzup(zzuv zzuv0, zzaca zzaca0) {
        this.zza = zzuv0;
        this.zzb = zzaca0;
    }

    @Override
    public final void run() {
        this.zza.zzF(this.zzb);
    }
}

