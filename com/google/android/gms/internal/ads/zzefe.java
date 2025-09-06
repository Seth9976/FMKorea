package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzefe implements Callable {
    public final zzefh zza;
    public final zzfbr zzb;
    public final zzfbe zzc;

    public zzefe(zzefh zzefh0, zzfbr zzfbr0, zzfbe zzfbe0) {
        this.zza = zzefh0;
        this.zzb = zzfbr0;
        this.zzc = zzfbe0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}

