package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevg implements zzesj {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbsg zzc;

    public zzevg(zzbsg zzbsg0, ScheduledExecutorService scheduledExecutorService0, Context context0) {
        this.zzc = zzbsg0;
        this.zza = scheduledExecutorService0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 49;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return zzfye.zzm(zzfye.zzo(zzfye.zzh(new Bundle()), ((long)(((Long)zzba.zzc().zzb(zzbbr.zzdU)))), TimeUnit.MILLISECONDS, this.zza), (Object object0) -> new zzevh(((Bundle)object0)), zzcan.zza);
    }
}

