package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzxr {
    private final CopyOnWriteArrayList zza;

    public zzxr() {
        this.zza = new CopyOnWriteArrayList();
    }

    public final void zza(Handler handler0, zzxs zzxs0) {
        this.zzc(zzxs0);
        zzxq zzxq0 = new zzxq(handler0, zzxs0);
        this.zza.add(zzxq0);
    }

    public final void zzb(int v, long v1, long v2) {
        for(Object object0: this.zza) {
            zzxq zzxq0 = (zzxq)object0;
            if(!zzxq0.zzc) {
                zzxq0.zza.post(new zzxp(zzxq0, v, v1, v2));
            }
        }
    }

    public final void zzc(zzxs zzxs0) {
        for(Object object0: this.zza) {
            zzxq zzxq0 = (zzxq)object0;
            if(zzxq0.zzb == zzxs0) {
                zzxq0.zzc();
                this.zza.remove(zzxq0);
            }
        }
    }
}

