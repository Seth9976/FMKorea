package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdwb implements Callable {
    public final zzdwd zza;
    public final zzbun zzb;

    public zzdwb(zzdwd zzdwd0, zzbun zzbun0) {
        this.zza = zzdwd0;
        this.zzb = zzbun0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}

