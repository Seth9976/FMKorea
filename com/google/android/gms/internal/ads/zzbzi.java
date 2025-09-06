package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

final class zzbzi {
    private final Object zza;
    private volatile long zzb;
    private volatile int zzc;

    private zzbzi() {
        this.zza = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    zzbzi(zzbzh zzbzh0) {
        this.zza = new Object();
        this.zzc = 1;
        this.zzb = 0L;
    }

    public final void zza() {
        long v = zzt.zzB().currentTimeMillis();
        synchronized(this.zza) {
            if(this.zzc == 3 && this.zzb + ((long)(((Long)zzba.zzc().zzb(zzbbr.zzfP)))) <= v) {
                this.zzc = 1;
            }
        }
        long v2 = zzt.zzB().currentTimeMillis();
        synchronized(this.zza) {
            if(this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            this.zzb = v2;
        }
    }
}

