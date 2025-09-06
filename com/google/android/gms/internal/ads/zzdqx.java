package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzdqx implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdqx(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzdrk zzdrk0 = (zzdrk)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        zzear zzear0 = (zzear)this.zzc.zzb();
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() ? new zzddo(zzear0, zzcan.zza) : new zzddo(zzdrk0, zzcan.zza);
    }
}

