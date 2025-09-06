package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Callable;

public final class zzcvl implements Callable {
    public final zzcvm zza;
    public final d zzb;

    public zzcvl(zzcvm zzcvm0, d d0) {
        this.zza = zzcvm0;
        this.zzb = d0;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}

