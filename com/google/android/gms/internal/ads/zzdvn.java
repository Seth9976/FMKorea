package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;

public final class zzdvn implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdvn(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzaqx zzaqx0 = (zzaqx)this.zza.zzb();
        Context context0 = ((zzchj)this.zzb).zza();
        zzgzb.zzb(zzcan.zza);
        zzdvk zzdvk0 = new zzdvk(zzaqx0, context0);
        d d0 = zzcan.zza.zzb(zzdvk0);
        zzgzb.zzb(d0);
        return d0;
    }
}

