package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

public final class zzdpw implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdpw(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzb.zzb(zzcan.zza);
        zzdqo zzdqo0 = ((zzdqp)this.zzb).zza();
        Set set0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzeL)).booleanValue() ? Collections.singleton(new zzddo(zzdqo0, zzcan.zza)) : Collections.emptySet();
        zzgzb.zzb(set0);
        return set0;
    }
}

