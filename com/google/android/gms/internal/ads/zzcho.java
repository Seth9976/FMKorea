package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

public final class zzcho implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzcho(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzeam zzeam0 = (zzeam)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        Set set0 = !((Boolean)zzba.zzc().zzb(zzbbr.zzbW)).booleanValue() || !((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue() ? Collections.emptySet() : Collections.singleton(new zzddo(zzeam0, zzcan.zza));
        zzgzb.zzb(set0);
        return set0;
    }
}

