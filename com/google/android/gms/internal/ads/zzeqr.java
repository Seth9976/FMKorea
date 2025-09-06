package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeqr implements zzesj {
    private final zzesj zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqr(zzesj zzesj0, long v, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = zzesj0;
        this.zzb = v;
        this.zzc = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        d d0 = this.zza.zzb();
        long v = this.zzb;
        if(v > 0L) {
            d0 = zzfye.zzo(d0, v, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfye.zzf(d0, Throwable.class, zzeqq.zza, zzcan.zzf);
    }
}

