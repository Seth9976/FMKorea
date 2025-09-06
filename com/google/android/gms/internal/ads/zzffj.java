package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzffj implements d {
    private final Object zza;
    private final String zzb;
    private final d zzc;

    public zzffj(Object object0, String s, d d0) {
        this.zza = object0;
        this.zzb = s;
        this.zzc = d0;
    }

    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zzc.addListener(runnable0, executor0);
    }

    @Override
    public final boolean cancel(boolean z) {
        return this.zzc.cancel(z);
    }

    @Override
    public final Object get() {
        return this.zzc.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.zzc.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    @Override
    public final String toString() {
        return this.zzb + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}

