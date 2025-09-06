package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class zzfxw extends zzfxv {
    private final d zza;

    zzfxw(d d0) {
        d0.getClass();
        this.zza = d0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zza.addListener(runnable0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final Object get() {
        return this.zza.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.zza.get(v, timeUnit0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    public final String toString() {
        return this.zza.toString();
    }
}

