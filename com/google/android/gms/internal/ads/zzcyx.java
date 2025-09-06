package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcyx extends zzdbs {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzcyx(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService0;
        this.zzc = clock0;
    }

    public final void zza() {
        synchronized(this) {
            this.zzf = false;
            this.zze(0L);
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!this.zzf) {
                if(this.zzg == null || this.zzg.isCancelled()) {
                    this.zze = -1L;
                }
                else {
                    this.zzg.cancel(true);
                    this.zze = this.zzd - this.zzc.elapsedRealtime();
                }
                this.zzf = true;
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            if(this.zzf) {
                if(this.zze > 0L && this.zzg.isCancelled()) {
                    this.zze(this.zze);
                }
                this.zzf = false;
            }
        }
    }

    public final void zzd(int v) {
        synchronized(this) {
            if(v <= 0) {
                return;
            }
            long v2 = TimeUnit.SECONDS.toMillis(((long)v));
            if(this.zzf) {
                long v3 = this.zze;
                if(v3 <= 0L || v2 >= v3) {
                    v2 = v3;
                }
                this.zze = v2;
                return;
            }
            if(this.zzc.elapsedRealtime() <= this.zzd && this.zzd - this.zzc.elapsedRealtime() <= v2) {
                return;
            }
            this.zze(v2);
        }
    }

    private final void zze(long v) {
        synchronized(this) {
            if(this.zzg != null && !this.zzg.isDone()) {
                this.zzg.cancel(true);
            }
            this.zzd = this.zzc.elapsedRealtime() + v;
            zzcyw zzcyw0 = new zzcyw(this, null);
            this.zzg = this.zzb.schedule(zzcyw0, v, TimeUnit.MILLISECONDS);
        }
    }
}

