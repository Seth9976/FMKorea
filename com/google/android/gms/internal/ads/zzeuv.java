package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;

public final class zzeuv implements Callable {
    public final d zza;
    public final d zzb;

    public zzeuv(d d0, d d1) {
        this.zza = d0;
        this.zzb = d1;
    }

    @Override
    public final Object call() {
        return new zzeux(((String)this.zza.get()), ((String)this.zzb.get()));
    }
}

