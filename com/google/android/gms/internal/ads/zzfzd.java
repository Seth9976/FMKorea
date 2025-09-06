package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class zzfzd extends zzfxu implements RunnableFuture {
    private volatile zzfyn zza;

    zzfzd(zzfxk zzfxk0) {
        this.zza = new zzfzb(this, zzfxk0);
    }

    zzfzd(Callable callable0) {
        this.zza = new zzfzc(this, callable0);
    }

    @Override
    public final void run() {
        zzfyn zzfyn0 = this.zza;
        if(zzfyn0 != null) {
            zzfyn0.run();
        }
        this.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        zzfyn zzfyn0 = this.zza;
        return zzfyn0 == null ? super.zza() : "task=[" + zzfyn0.toString() + "]";
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        if(this.zzt()) {
            zzfyn zzfyn0 = this.zza;
            if(zzfyn0 != null) {
                zzfyn0.zzh();
            }
        }
        this.zza = null;
    }

    static zzfzd zze(Runnable runnable0, Object object0) {
        return new zzfzd(Executors.callable(runnable0, object0));
    }
}

