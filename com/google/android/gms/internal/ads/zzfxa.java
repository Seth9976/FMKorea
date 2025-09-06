package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

abstract class zzfxa extends zzfxu implements Runnable {
    d zza;
    Object zzb;
    public static final int zzc;

    zzfxa(d d0, Object object0) {
        d0.getClass();
        this.zza = d0;
        this.zzb = object0;
    }

    @Override
    public final void run() {
        Object object2;
        Object object1;
        d d0 = this.zza;
        Object object0 = this.zzb;
        if((this.isCancelled() | d0 == null | (object0 == null ? 1 : 0)) != 0) {
            return;
        }
        this.zza = null;
        if(d0.isCancelled()) {
            this.zzs(d0);
            return;
        }
        try {
            object1 = zzfye.zzp(d0);
        }
        catch(CancellationException unused_ex) {
            this.cancel(false);
            return;
        }
        catch(ExecutionException executionException0) {
            this.zzd(executionException0.getCause());
            return;
        }
        catch(RuntimeException runtimeException0) {
            this.zzd(runtimeException0);
            return;
        }
        catch(Error error0) {
            this.zzd(error0);
            return;
        }
        try {
            object2 = this.zze(object0, object1);
        }
        catch(Throwable throwable0) {
            try {
                zzfyv.zza(throwable0);
                this.zzd(throwable0);
                this.zzb = null;
                return;
            }
            catch(Throwable throwable1) {
                this.zzb = null;
                throw throwable1;
            }
        }
        this.zzb = null;
        this.zzf(object2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final String zza() {
        d d0 = this.zza;
        Object object0 = this.zzb;
        String s = super.zza();
        String s1 = d0 == null ? "" : "inputFuture=[" + d0.toString() + "], ";
        if(object0 != null) {
            return s1 + "function=[" + object0.toString() + "]";
        }
        return s == null ? null : s1 + s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws
    protected final void zzb() {
        this.zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object arg1, Object arg2);

    abstract void zzf(Object arg1);
}

