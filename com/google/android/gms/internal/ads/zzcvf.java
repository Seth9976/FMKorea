package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcvf implements zzauf, zzcwi, zzcwy, zzdba, zzddf {
    private final zzcxa zza;
    private final zzfbe zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfyw zze;
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg;
    private final String zzh;

    zzcvf(zzcxa zzcxa0, zzfbe zzfbe0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, String s) {
        this.zze = zzfyw.zze();
        this.zzg = new AtomicBoolean();
        this.zza = zzcxa0;
        this.zzb = zzfbe0;
        this.zzc = scheduledExecutorService0;
        this.zzd = executor0;
        this.zzh = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzki)).booleanValue() && this.zzm() && zzaue0.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzfbe zzfbe0 = this.zzb;
        if(zzfbe0.zzf == 3) {
            return;
        }
        if(zzfbe0.zzZ != 0 && zzfbe0.zzZ != 1) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzki)).booleanValue() && this.zzm()) {
            return;
        }
        this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    static zzcxa zzg(zzcvf zzcvf0) {
        return zzcvf0.zza;
    }

    // 检测为 Lambda 实现
    final void zzh() [...]

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdba
    public final void zzj() {
        synchronized(this) {
            if(this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.zzf;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
        if(this.zzb.zzf == 3) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbt)).booleanValue()) {
            zzfbe zzfbe0 = this.zzb;
            if(zzfbe0.zzZ == 2) {
                if(zzfbe0.zzr == 0) {
                    this.zza.zza();
                    return;
                }
                zzcve zzcve0 = new zzcve(this);
                zzfye.zzr(this.zze, zzcve0, this.zzd);
                zzcvd zzcvd0 = () -> synchronized(this) {
                    if(this.zze.isDone()) {
                        return;
                    }
                    this.zze.zzc(Boolean.TRUE);
                };
                this.zzf = this.zzc.schedule(zzcvd0, ((long)this.zzb.zzr), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(com.google.android.gms.ads.internal.client.zze zze0) {
        synchronized(this) {
            if(this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.zzf;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.zze.zzd(new Exception());
        }
    }
}

