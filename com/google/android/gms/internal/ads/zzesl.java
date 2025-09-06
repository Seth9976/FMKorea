package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzesl implements Callable {
    public final List zza;
    public final Object zzb;

    public zzesl(List list0, Object object0) {
        this.zza = list0;
        this.zzb = object0;
    }

    @Override
    public final Object call() {
        Object object0 = this.zzb;
        for(Object object1: this.zza) {
            zzesi zzesi0 = (zzesi)((d)object1).get();
            if(zzesi0 != null) {
                zzesi0.zzj(object0);
            }
        }
        return object0;
    }
}

