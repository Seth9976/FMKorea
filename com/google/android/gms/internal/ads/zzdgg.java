package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdgg implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzdgg(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Map map0 = ((zzgyx)this.zza).zzd();
        Map map1 = ((zzgyx)this.zzb).zzd();
        Map map2 = ((zzgyx)this.zzc).zzd();
        zzdin zzdin0 = ((zzdgk)this.zze).zza();
        return new zzdgf(map0, map1, map2, this.zzd, zzdin0);
    }
}

