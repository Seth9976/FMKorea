package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcp;

abstract class zzaw {
    private static volatile Handler zza;
    private final zzif zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzaw(zzif zzif0) {
        Preconditions.checkNotNull(zzif0);
        this.zzb = zzif0;
        this.zzc = new zzav(this, zzif0);
    }

    static void zza(zzaw zzaw0, long v) {
        zzaw0.zzd = 0L;
    }

    final void zza() {
        this.zzd = 0L;
        this.zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long v) {
        this.zza();
        if(v >= 0L) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if(!this.zzd().postDelayed(this.zzc, v)) {
                this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", v);
            }
        }
    }

    public abstract void zzb();

    public final boolean zzc() {
        return this.zzd != 0L;
    }

    private final Handler zzd() {
        if(zzaw.zza != null) {
            return zzaw.zza;
        }
        synchronized(zzaw.class) {
            if(zzaw.zza == null) {
                zzaw.zza = new zzcp(this.zzb.zza().getMainLooper());
            }
            return zzaw.zza;
        }
    }
}

