package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdyt implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdyt(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzdys zza() {
        return new zzdys(((zzchj)this.zza).zza(), ((ScheduledExecutorService)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

