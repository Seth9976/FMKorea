package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzdly implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdly(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return new zzdlw(((Executor)this.zza.zzb()), ((zzcpi)this.zzb.zzb()), ((zzddq)this.zzc.zzb()));
    }
}

