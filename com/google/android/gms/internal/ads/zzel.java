package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArraySet;

public final class zzel implements Runnable {
    public final CopyOnWriteArraySet zza;
    public final int zzb;
    public final zzem zzc;

    public zzel(CopyOnWriteArraySet copyOnWriteArraySet0, int v, zzem zzem0) {
        this.zza = copyOnWriteArraySet0;
        this.zzb = v;
        this.zzc = zzem0;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        zzem zzem0 = this.zzc;
        for(Object object0: this.zza) {
            ((zzeo)object0).zza(v, zzem0);
        }
    }
}

