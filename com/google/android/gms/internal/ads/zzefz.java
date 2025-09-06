package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzefz implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzefz(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    public final zzefy zza() {
        return new zzefy(((Context)this.zza.zzb()), ((zzdfq)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

