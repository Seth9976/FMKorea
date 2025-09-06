package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzcvg implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzcvg(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        zzfbe zzfbe0 = ((zzcsu)this.zzb).zza();
        Object object1 = this.zzc.zzb();
        zzgzb.zzb(zzcan.zza);
        String s = ((zzcsv)this.zze).zza();
        return new zzcvf(((zzcxa)object0), zzfbe0, ((ScheduledExecutorService)object1), zzcan.zza, s);
    }
}

