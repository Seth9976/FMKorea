package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzehk implements zzgyt {
    private final zzehj zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzehk(zzehj zzehj0, zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzehj0;
        this.zzb = zzgzg0;
        this.zzc = zzgzg1;
        this.zzd = zzgzg2;
        this.zze = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Clock clock0 = (Clock)this.zzb.zzb();
        zzehd zzehd0 = ((zzehe)this.zzc).zza();
        zzeds zzeds0 = (zzeds)this.zzd.zzb();
        zzfik zzfik0 = (zzfik)this.zze.zzb();
        return this.zza.zza(clock0, zzehd0, zzeds0, zzfik0);
    }
}

