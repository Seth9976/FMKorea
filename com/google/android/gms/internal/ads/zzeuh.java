package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class zzeuh implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzeuh(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
    }

    public static zzeuf zza(String s, zzawh zzawh0, zzbzj zzbzj0, ScheduledExecutorService scheduledExecutorService0, zzfyo zzfyo0) {
        return new zzeuf(s, zzawh0, zzbzj0, scheduledExecutorService0, zzfyo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        String s = ((zzevk)this.zza).zza();
        zzawh zzawh0 = new zzawh();
        Object object0 = this.zzc.zzb();
        Object object1 = this.zzd.zzb();
        zzgzb.zzb(zzcan.zza);
        return new zzeuf(s, zzawh0, ((zzbzj)object0), ((ScheduledExecutorService)object1), zzcan.zza);
    }
}

