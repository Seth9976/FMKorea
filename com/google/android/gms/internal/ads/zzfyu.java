package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfyu {
    public static zzfyo zza(ExecutorService executorService0) {
        if(executorService0 instanceof zzfyo) {
            return (zzfyo)executorService0;
        }
        return executorService0 instanceof ScheduledExecutorService ? new zzfyt(((ScheduledExecutorService)executorService0)) : new zzfyq(executorService0);
    }

    public static Executor zzb() {
        return zzfxs.zza;
    }

    static Executor zzc(Executor executor0, zzfws zzfws0) {
        executor0.getClass();
        return executor0 == zzfxs.zza ? executor0 : new zzfyp(executor0, zzfws0);
    }
}

