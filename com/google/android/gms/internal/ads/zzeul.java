package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeul implements zzesj {
    private final Context zza;
    private final zzbzj zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzbza zzf;

    public zzeul(zzbza zzbza0, int v, Context context0, zzbzj zzbzj0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, String s) {
        this.zzf = zzbza0;
        this.zza = context0;
        this.zzb = zzbzj0;
        this.zzc = scheduledExecutorService0;
        this.zzd = executor0;
        this.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 44;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzfxv zzfxv0 = (zzfxv)zzfye.zzo(zzfye.zzm(zzfxv.zzu(zzfye.zzk(new zzeui(this), this.zzd)), (Object object0) -> (((String)object0) == null ? null : new zzeum(((String)object0))), this.zzd), ((long)(((Long)zzba.zzc().zzb(zzbbr.zzaT)))), TimeUnit.MILLISECONDS, this.zzc);
        zzeuk zzeuk0 = new zzeuk(this);
        return zzfye.zze(zzfxv0, Exception.class, zzeuk0, zzfyu.zzb());
    }

    final zzeum zzc(Exception exception0) {
        this.zzb.zzu(exception0, "AttestationTokenSignal");
        return null;
    }
}

