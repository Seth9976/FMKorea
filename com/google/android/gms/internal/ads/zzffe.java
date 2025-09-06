package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class zzffe implements zzgyt {
    private final zzgzg zza;

    public zzffe(zzgzg zzgzg0) {
        this.zza = zzgzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        ScheduledExecutorService scheduledExecutorService0 = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, ((ThreadFactory)this.zza.zzb())));
        zzgzb.zzb(scheduledExecutorService0);
        return scheduledExecutorService0;
    }
}

