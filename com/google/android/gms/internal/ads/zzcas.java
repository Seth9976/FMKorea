package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class zzcas implements d {
    private final zzfyw zza;

    public zzcas() {
        this.zza = zzfyw.zze();
    }

    @Override  // Z1.d
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zza.addListener(runnable0, executor0);
    }

    @Override
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override
    public final Object get() {
        return this.zza.get();
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return this.zza.get(v, timeUnit0);
    }

    @Override
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.zza.isDone();
    }

    private static final boolean zza(boolean z) {
        if(!z) {
            zzt.zzo().zzt(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean zzc(Object object0) {
        boolean z = this.zza.zzc(object0);
        zzcas.zza(z);
        return z;
    }

    public final boolean zzd(Throwable throwable0) {
        boolean z = this.zza.zzd(throwable0);
        zzcas.zza(z);
        return z;
    }
}

