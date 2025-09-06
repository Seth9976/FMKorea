package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;

public final class zzfbd {
    private final Clock zza;
    private final Object zzb;
    private volatile long zzc;
    private volatile int zzd;

    public zzfbd(Clock clock0) {
        this.zzb = new Object();
        this.zzd = 1;
        this.zzc = 0L;
        this.zza = clock0;
    }

    public final void zza() {
        this.zzf(2, 3);
    }

    public final void zzb(boolean z) {
        if(z) {
            this.zzf(1, 2);
            return;
        }
        this.zzf(2, 1);
    }

    public final boolean zzc() {
        synchronized(this.zzb) {
            this.zze();
            return this.zzd == 3;
        }
    }

    public final boolean zzd() {
        synchronized(this.zzb) {
            this.zze();
            return this.zzd == 2;
        }
    }

    private final void zze() {
        long v = this.zza.currentTimeMillis();
        synchronized(this.zzb) {
            if(this.zzd == 3 && this.zzc + ((long)(((Long)zzba.zzc().zzb(zzbbr.zzfP)))) <= v) {
                this.zzd = 1;
            }
        }
    }

    private final void zzf(int v, int v1) {
        this.zze();
        long v2 = this.zza.currentTimeMillis();
        synchronized(this.zzb) {
            if(this.zzd != v) {
                return;
            }
            this.zzd = v1;
            if(this.zzd == 3) {
                this.zzc = v2;
            }
        }
    }
}

