package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevx implements zzesj {
    private final zzbzj zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfyo zze;
    private final String zzf;
    private final zzbyy zzg;

    zzevx(zzbzj zzbzj0, boolean z, boolean z1, zzbyy zzbyy0, zzfyo zzfyo0, String s, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = zzbzj0;
        this.zzb = z;
        this.zzc = z1;
        this.zzg = zzbyy0;
        this.zze = zzfyo0;
        this.zzf = s;
        this.zzd = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 50;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzha)).booleanValue() && this.zzc) {
            return zzfye.zzh(null);
        }
        if(!this.zzb) {
            return zzfye.zzh(null);
        }
        d d0 = zzfye.zzo(zzfye.zzm(zzfye.zzh(null), zzevv.zza, this.zze), ((long)(((Long)zzbdx.zzc.zze()))), TimeUnit.MILLISECONDS, this.zzd);
        zzevw zzevw0 = new zzevw(this);
        return zzfye.zze(d0, Exception.class, zzevw0, this.zze);
    }

    final zzevy zzc(Exception exception0) {
        this.zza.zzu(exception0, "TrustlessTokenSignal");
        return null;
    }
}

