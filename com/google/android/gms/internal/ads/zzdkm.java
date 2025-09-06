package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdkm implements zzgyt {
    private final zzdkf zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdkm(zzdkf zzdkf0, zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzdkf0;
        this.zzb = zzgzg0;
        this.zzc = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzddo(((zzdnm)this.zzb).zza(), ((Executor)this.zzc.zzb()));
    }
}

