package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdxf implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdxf(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    public final zzdxe zza() {
        Map map0 = ((zzgza)this.zza).zzd();
        zzgzb.zzb(zzcan.zza);
        zzczb zzczb0 = ((zzczc)this.zzc).zza();
        return new zzdxe(map0, zzcan.zza, zzczb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

