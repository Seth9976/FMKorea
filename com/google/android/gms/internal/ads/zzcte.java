package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;

public final class zzcte implements Callable {
    public final zzctl zza;
    public final d zzb;
    public final d zzc;
    public final d zzd;

    public zzcte(zzctl zzctl0, d d0, d d1, d d2) {
        this.zza = zzctl0;
        this.zzb = d0;
        this.zzc = d1;
        this.zzd = d2;
    }

    @Override
    public final Object call() {
        return this.zza.zzg(this.zzb, this.zzc, this.zzd);
    }
}

