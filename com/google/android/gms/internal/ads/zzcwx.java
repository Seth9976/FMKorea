package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class zzcwx implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzcwx(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzcwu zzcwu0 = ((zzcww)this.zza).zza();
        Set set0 = ((zzgze)this.zzb).zzc();
        zzgzb.zzb(zzcan.zza);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzd.zzb();
        return new zzcwv(zzcwu0, set0, zzcan.zza, scheduledExecutorService0);
    }
}

