package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzevz implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;

    public zzevz(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        boolean z = ((zzevn)this.zzb).zza().booleanValue();
        boolean z1 = ((zzevo)this.zzc).zza().booleanValue();
        zzbyy zzbyy0 = new zzbyy();
        zzgzb.zzb(zzcan.zza);
        String s = ((zzevk)this.zzf).zza();
        Object object1 = this.zzg.zzb();
        return new zzevx(((zzbzj)object0), z, z1, zzbyy0, zzcan.zza, s, ((ScheduledExecutorService)object1));
    }
}

