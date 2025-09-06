package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfyx implements Runnable {
    zzfza zza;

    zzfyx(zzfza zzfza0) {
        this.zza = zzfza0;
    }

    @Override
    public final void run() {
        zzfza zzfza0 = this.zza;
        if(zzfza0 == null) {
            return;
        }
        d d0 = zzfza0.zza;
        if(d0 == null) {
            return;
        }
        this.zza = null;
        if(d0.isDone()) {
            zzfza0.zzs(d0);
            return;
        }
        try {
            ScheduledFuture scheduledFuture0 = zzfza0.zzb;
            zzfza.zzw(zzfza0, null);
            String s = "Timed out";
            if(scheduledFuture0 != null) {
                try {
                    long v1 = Math.abs(scheduledFuture0.getDelay(TimeUnit.MILLISECONDS));
                    if(v1 > 10L) {
                        s = "Timed out (timeout delayed by " + v1 + " ms after scheduled time)";
                    }
                    goto label_23;
                }
                catch(Throwable throwable0) {
                }
                zzfza0.zzd(new zzfyz("Timed out", null));
                throw throwable0;
            }
        label_23:
            zzfza0.zzd(new zzfyz(s + ": " + d0.toString(), null));
        }
        finally {
            d0.cancel(true);
        }
    }
}

