package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcwv extends zzdbs implements zzcwm {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwv(zzcwu zzcwu0, Set set0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        super(set0);
        this.zzd = false;
        this.zzb = scheduledExecutorService0;
        this.zzo(zzcwu0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zza(zze zze0) {
        this.zzt(new zzcwo(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        this.zzt((zzcwq this) -> ((zzcwm)object0).zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(zzdfx zzdfx0) {
        if(this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture0 = this.zzc;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        this.zzt(new zzcwn(zzdfx0));
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    public final void zze() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.zzc;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
        }
    }

    public final void zzf() {
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzjI)));
        zzcwp zzcwp0 = () -> synchronized(this) {
            zzcaa.zzg("Timeout waiting for show call succeed to be called.");
            this.zzc(new zzdfx("Timeout for show call succeed."));
            this.zzd = true;
        };
        this.zzc = this.zzb.schedule(zzcwp0, ((long)v), TimeUnit.MILLISECONDS);
    }
}

