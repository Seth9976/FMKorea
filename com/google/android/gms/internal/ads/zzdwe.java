package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzdwe implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzdwe(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    public final zzdwd zza() {
        Object object0 = this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        zzgzb.zzb(zzcan.zzb);
        zzdwu zzdwu0 = ((zzdwv)this.zzd).zza();
        zzgyn zzgyn0 = zzgys.zza(this.zze);
        return new zzdwd(((ScheduledExecutorService)object0), zzcan.zza, zzcan.zzb, zzdwu0, zzgyn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

