package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfyt extends zzfyq implements zzfyo, ScheduledExecutorService {
    final ScheduledExecutorService zza;

    zzfyt(ScheduledExecutorService scheduledExecutorService0) {
        super(scheduledExecutorService0);
        scheduledExecutorService0.getClass();
        this.zza = scheduledExecutorService0;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        zzfzd zzfzd0 = zzfzd.zze(runnable0, null);
        return new zzfyr(zzfzd0, this.zza.schedule(zzfzd0, v, timeUnit0));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        zzfzd zzfzd0 = new zzfzd(callable0);
        return new zzfyr(zzfzd0, this.zza.schedule(zzfzd0, v, timeUnit0));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        zzfys zzfys0 = new zzfys(runnable0);
        return new zzfyr(zzfys0, this.zza.scheduleAtFixedRate(zzfys0, v, v1, timeUnit0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        zzfys zzfys0 = new zzfys(runnable0);
        return new zzfyr(zzfys0, this.zza.scheduleWithFixedDelay(zzfys0, v, v1, timeUnit0));
    }
}

