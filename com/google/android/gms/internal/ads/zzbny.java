package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbny {
    private static zzbny zza;
    private final AtomicBoolean zzb;

    zzbny() {
        this.zzb = new AtomicBoolean(false);
    }

    public static zzbny zza() {
        if(zzbny.zza == null) {
            zzbny.zza = new zzbny();
        }
        return zzbny.zza;
    }

    public final Thread zzb(Context context0, String s) {
        if(!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread0 = new Thread(new zzbnx(this, context0, s));
        thread0.start();
        return thread0;
    }
}

