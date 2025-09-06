package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcun implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcun(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzddo(((zzdap)this.zza.zzb()), ((Executor)this.zzb.zzb()));
    }
}

