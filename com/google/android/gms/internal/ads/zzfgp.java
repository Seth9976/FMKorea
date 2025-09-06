package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfgp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzfgp(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgyn zzgyn0 = zzgys.zza(this.zza);
        zzgyn zzgyn1 = zzgys.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzc.zzb();
        zzfgo zzfgo0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzim)).booleanValue() ? new zzfgr(((zzfgo)zzgyn0.zzb()), scheduledExecutorService0) : ((zzfgo)zzgyn1.zzb());
        zzgzb.zzb(zzfgo0);
        return zzfgo0;
    }
}

