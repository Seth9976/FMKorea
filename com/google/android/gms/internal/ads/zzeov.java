package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeov implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeov(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzeol zzeol0 = zzeon.zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzb.zzb();
        zzfui zzfui0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzdQ)).booleanValue() ? zzfui.zzn(new zzeqr(zzeol0, ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzdR)))))), scheduledExecutorService0)) : zzfui.zzm();
        zzgzb.zzb(zzfui0);
        return zzfui0;
    }
}

