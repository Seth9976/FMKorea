package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdwd {
    private final ScheduledExecutorService zza;
    private final zzfyo zzb;
    private final zzfyo zzc;
    private final zzdwu zzd;
    private final zzgyn zze;

    public zzdwd(ScheduledExecutorService scheduledExecutorService0, zzfyo zzfyo0, zzfyo zzfyo1, zzdwu zzdwu0, zzgyn zzgyn0) {
        this.zza = scheduledExecutorService0;
        this.zzb = zzfyo0;
        this.zzc = zzfyo1;
        this.zzd = zzdwu0;
        this.zze = zzgyn0;
    }

    // 检测为 Lambda 实现
    final d zza(zzbun zzbun0, int v, Throwable throwable0) [...]

    public final d zzb(zzbun zzbun0) {
        d d0;
        if(zzs.zzz(zzbun0.zzd)) {
            d0 = zzfye.zzg(new zzdxh(1));
        }
        else if(((Boolean)zzba.zzc().zzb(zzbbr.zzhs)).booleanValue()) {
            zzdwb zzdwb0 = () -> ((InputStream)this.zzd.zzb(zzbun0).get(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS));
            d0 = this.zzc.zzb(zzdwb0);
        }
        else {
            d0 = this.zzd.zzb(zzbun0);
        }
        int v = Binder.getCallingUid();
        zzfxv zzfxv0 = (zzfxv)zzfye.zzo(zzfxv.zzu(d0), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfr)))))), TimeUnit.SECONDS, this.zza);
        zzdwc zzdwc0 = (Throwable throwable0) -> ((zzdzo)this.zze.zzb()).zzd(zzbun0, v);
        return zzfye.zzf(zzfxv0, Throwable.class, zzdwc0, this.zzb);
    }

    // 检测为 Lambda 实现
    final InputStream zzc(zzbun zzbun0) [...]
}

