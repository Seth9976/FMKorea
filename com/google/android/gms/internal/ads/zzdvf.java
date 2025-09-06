package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdvf implements Callable {
    public final zzdvi zza;
    public final zzbun zzb;

    public zzdvf(zzdvi zzdvi0, zzbun zzbun0) {
        this.zza = zzdvi0;
        this.zzb = zzbun0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}

