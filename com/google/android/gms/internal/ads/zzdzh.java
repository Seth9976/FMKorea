package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;

public final class zzdzh implements Callable {
    public final d zza;
    public final d zzb;

    public zzdzh(d d0, d d1) {
        this.zza = d0;
        this.zzb = d1;
    }

    @Override
    public final Object call() {
        return new zzdzn(((zzeab)this.zza.get()), ((zzdzl)this.zzb.get()).zzb, ((zzdzl)this.zzb.get()).zza);
    }
}

