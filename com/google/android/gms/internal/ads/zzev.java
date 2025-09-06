package com.google.android.gms.internal.ads;

public final class zzev implements Runnable {
    public final zzez zza;
    public final zzxv zzb;

    public zzev(zzez zzez0, zzxv zzxv0) {
        this.zza = zzez0;
        this.zzb = zzxv0;
    }

    @Override
    public final void run() {
        int v = this.zza.zza();
        zzxx.zzh(this.zzb.zza, v);
    }
}

