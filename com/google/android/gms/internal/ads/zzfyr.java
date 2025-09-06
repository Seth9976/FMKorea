package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfyr extends zzfxy implements d, ScheduledFuture {
    private final ScheduledFuture zza;

    public zzfyr(d d0, ScheduledFuture scheduledFuture0) {
        super(d0);
        this.zza = scheduledFuture0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxx
    public final boolean cancel(boolean z) {
        boolean z1 = this.zzb().cancel(z);
        if(z1) {
            this.zza.cancel(z);
        }
        return z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza.compareTo(((Delayed)object0));
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return this.zza.getDelay(timeUnit0);
    }
}

