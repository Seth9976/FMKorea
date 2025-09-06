package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzfyi implements d {
    static final d zza;
    private static final Logger zzb;
    private final Object zzc;

    static {
        zzfyi.zza = new zzfyi(null);
        zzfyi.zzb = Logger.getLogger("com.google.android.gms.internal.ads.zzfyi");
    }

    zzfyi(Object object0) {
        this.zzc = object0;
    }

    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        zzfri.zzc(runnable0, "Runnable was null.");
        zzfri.zzc(executor0, "Executor was null.");
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            zzfyi.zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override
    public final Object get() {
        return this.zzc;
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        timeUnit0.getClass();
        return this.zzc;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    @Override
    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.zzc + "]]";
    }
}

