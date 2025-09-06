package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

public final class zzccd {
    private final long zza;
    private long zzb;
    private boolean zzc;

    zzccd() {
        this.zza = TimeUnit.MILLISECONDS.toNanos(((long)(((Long)zzba.zzc().zzb(zzbbr.zzD)))));
        this.zzc = true;
    }

    public final void zza(SurfaceTexture surfaceTexture0, zzcbo zzcbo0) {
        if(zzcbo0 == null) {
            return;
        }
        long v = surfaceTexture0.getTimestamp();
        if(!this.zzc && Math.abs(v - this.zzb) < this.zza) {
            return;
        }
        this.zzc = false;
        this.zzb = v;
        zzccc zzccc0 = new zzccc(zzcbo0);
        zzs.zza.post(zzccc0);
    }

    public final void zzb() {
        this.zzc = true;
    }
}

