package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

public final class zzaww implements Runnable {
    public final zzcas zza;
    public final Future zzb;

    public zzaww(zzcas zzcas0, Future future0) {
        this.zza = zzcas0;
        this.zzb = future0;
    }

    @Override
    public final void run() {
        Future future0 = this.zzb;
        if(this.zza.isCancelled()) {
            future0.cancel(true);
        }
    }
}

