package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzs implements Callable {
    public final zzaa zza;
    public final List zzb;
    public final IObjectWrapper zzc;

    public zzs(zzaa zzaa0, List list0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzaa0;
        this.zzb = list0;
        this.zzc = iObjectWrapper0;
    }

    @Override
    public final Object call() {
        return this.zza.zzC(this.zzb, this.zzc);
    }
}

