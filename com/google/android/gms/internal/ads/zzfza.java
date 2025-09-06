package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfza extends zzfxu {
    private d zza;
    private ScheduledFuture zzb;

    private zzfza(d d0) {
        d0.getClass();
        this.zza = d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        d d0 = this.zza;
        ScheduledFuture scheduledFuture0 = this.zzb;
        if(d0 != null) {
            String s = "inputFuture=[" + d0.toString() + "]";
            if(scheduledFuture0 != null) {
                long v = scheduledFuture0.getDelay(TimeUnit.MILLISECONDS);
                return v <= 0L ? s : s + ", remaining delay=[" + v + " ms]";
            }
            return s;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        this.zzr(this.zza);
        ScheduledFuture scheduledFuture0 = this.zzb;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    static d zzf(d d0, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        d d1 = new zzfza(d0);
        zzfyx zzfyx0 = new zzfyx(((zzfza)d1));
        d1.zzb = scheduledExecutorService0.schedule(zzfyx0, v, timeUnit0);
        d0.addListener(zzfyx0, zzfxs.zza);
        return d1;
    }

    static void zzw(zzfza zzfza0, ScheduledFuture scheduledFuture0) {
        zzfza0.zzb = null;
    }
}

