package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

public final class zzchp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzchp(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzdtl zzdtl0 = (zzdtl)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        Set set0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzbA)).booleanValue() ? Collections.singleton(new zzddo(zzdtl0, zzcan.zza)) : Collections.emptySet();
        zzgzb.zzb(set0);
        return set0;
    }
}

