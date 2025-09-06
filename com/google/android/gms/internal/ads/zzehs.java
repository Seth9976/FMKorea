package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzehs implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzehs(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzehr zza() {
        return new zzehr(((Context)this.zza.zzb()), ((zzdnv)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

