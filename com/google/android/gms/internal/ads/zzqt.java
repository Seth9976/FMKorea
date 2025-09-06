package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzqt {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    public zzqt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzqt(CopyOnWriteArrayList copyOnWriteArrayList0, int v, zzts zzts0) {
        this.zzc = copyOnWriteArrayList0;
        this.zza = 0;
        this.zzb = zzts0;
    }

    public final zzqt zza(int v, zzts zzts0) {
        return new zzqt(this.zzc, 0, zzts0);
    }

    public final void zzb(Handler handler0, zzqu zzqu0) {
        zzqs zzqs0 = new zzqs(handler0, zzqu0);
        this.zzc.add(zzqs0);
    }

    public final void zzc(zzqu zzqu0) {
        for(Object object0: this.zzc) {
            zzqs zzqs0 = (zzqs)object0;
            if(zzqs0.zzb == zzqu0) {
                this.zzc.remove(zzqs0);
            }
        }
    }
}

