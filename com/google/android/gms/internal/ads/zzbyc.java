package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzbyc implements ThreadFactory {
    private final AtomicInteger zza;

    zzbyc(zzbyf zzbyf0) {
        this.zza = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "AdWorker(SCION_TASK_EXECUTOR) #" + this.zza.getAndIncrement());
    }
}

