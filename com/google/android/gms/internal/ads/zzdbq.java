package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdbq implements Runnable {
    public final zzdbr zza;
    public final Object zzb;

    public zzdbq(zzdbr zzdbr0, Object object0) {
        this.zza = zzdbr0;
        this.zzb = object0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zza(this.zzb);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzt(throwable0, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", throwable0);
        }
    }
}

