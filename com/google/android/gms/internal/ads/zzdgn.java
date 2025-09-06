package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzdgn implements zzgyt {
    private final zzgzg zza;

    public zzdgn(zzgzg zzgzg0) {
        this.zza = zzgzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Set set0 = ((zzdgk)this.zza).zza().zze() == null ? Collections.emptySet() : Collections.singleton("banner");
        zzgzb.zzb(set0);
        return set0;
    }
}

