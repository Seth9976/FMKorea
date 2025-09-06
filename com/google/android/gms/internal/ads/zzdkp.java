package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

public final class zzdkp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdkp(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzbo zzbo0 = (zzbo)this.zza.zzb();
        Clock clock0 = (Clock)this.zzb.zzb();
        zzgzb.zzb(zzcan.zza);
        return new zzdko(zzbo0, clock0, zzcan.zza);
    }
}

