package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzfwx extends AbstractExecutorService implements zzfyo {
    @Override
    protected final RunnableFuture newTaskFor(Runnable runnable0, Object object0) {
        return zzfzd.zze(runnable0, object0);
    }

    @Override
    protected final RunnableFuture newTaskFor(Callable callable0) {
        return new zzfzd(callable0);
    }

    @Override
    public final Future submit(Runnable runnable0) {
        return (d)super.submit(runnable0);
    }

    @Override
    public final Future submit(Runnable runnable0, Object object0) {
        return (d)super.submit(runnable0, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        return (d)super.submit(callable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyo
    public final d zza(Runnable runnable0) {
        return (d)super.submit(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyo
    public final d zzb(Callable callable0) {
        return (d)super.submit(callable0);
    }
}

