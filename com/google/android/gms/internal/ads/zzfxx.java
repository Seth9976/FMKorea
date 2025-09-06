package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class zzfxx extends zzftu implements Future {
    @Override
    public boolean cancel(boolean z) {
        return this.zzb().cancel(z);
    }

    @Override
    public final Object get() {
        return this.zzb().get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.zzb().get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zzb().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zzb().isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzftu
    protected Object zza() {
        throw null;
    }

    protected abstract Future zzb();
}

