package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdtb implements Callable {
    public final zzdtj zza;
    public final zzfhg zzb;

    public zzdtb(zzdtj zzdtj0, zzfhg zzfhg0) {
        this.zza = zzdtj0;
        this.zzb = zzfhg0;
    }

    @Override
    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}

