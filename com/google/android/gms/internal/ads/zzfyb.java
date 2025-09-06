package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class zzfyb implements Runnable {
    final Future zza;
    final zzfya zzb;

    zzfyb(Future future0, zzfya zzfya0) {
        this.zza = future0;
        this.zzb = zzfya0;
    }

    @Override
    public final void run() {
        Object object0;
        Future future0 = this.zza;
        if(future0 instanceof zzfzg) {
            Throwable throwable0 = zzfzh.zza(((zzfzg)future0));
            if(throwable0 != null) {
                this.zzb.zza(throwable0);
                return;
            }
        }
        try {
            object0 = zzfye.zzp(this.zza);
        }
        catch(ExecutionException executionException0) {
            this.zzb.zza(executionException0.getCause());
            return;
        }
        catch(RuntimeException | Error runtimeException0) {
            this.zzb.zza(runtimeException0);
            return;
        }
        this.zzb.zzb(object0);
    }

    @Override
    public final String toString() {
        zzfrb zzfrb0 = zzfrc.zza(this);
        zzfrb0.zza(this.zzb);
        return zzfrb0.toString();
    }
}

