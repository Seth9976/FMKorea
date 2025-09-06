package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcss {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final d zzc;
    private volatile boolean zzd;

    public zzcss(Executor executor0, ScheduledExecutorService scheduledExecutorService0, d d0) {
        this.zzd = true;
        this.zza = executor0;
        this.zzb = scheduledExecutorService0;
        this.zzc = d0;
    }

    // 检测为 Lambda 实现
    final d zza(zzfya zzfya0, d d0, zzcse zzcse0) [...]

    static void zzb(zzcss zzcss0, List list0, zzfya zzfya0) {
        if(list0 != null && !list0.isEmpty()) {
            d d0 = zzfye.zzh(null);
            for(Object object0: list0) {
                zzcsn zzcsn0 = new zzcsn(zzfya0);
                d0 = zzfye.zzn(zzfye.zzf(d0, Throwable.class, zzcsn0, zzcss0.zza), (zzcse zzcse0) -> {
                    if(zzcse0 != null) {
                        zzfya0.zzb(zzcse0);
                    }
                    return zzfye.zzo(((d)object0), ((long)(((Long)zzbdw.zzb.zze()))), TimeUnit.MILLISECONDS, zzcss0.zzb);
                }, zzcss0.zza);
            }
            zzfye.zzr(d0, new zzcsr(zzcss0, zzfya0), zzcss0.zza);
            return;
        }
        zzcsm zzcsm0 = new zzcsm(zzfya0);
        zzcss0.zza.execute(zzcsm0);
    }

    static void zzc(zzcss zzcss0) {
        zzcsp zzcsp0 = () -> zzcss0.zzd = false;
        zzcan.zze.execute(zzcsp0);
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    public final void zze(zzfya zzfya0) {
        zzcsq zzcsq0 = new zzcsq(this, zzfya0);
        zzfye.zzr(this.zzc, zzcsq0, this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}

