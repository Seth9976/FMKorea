package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzdy implements Runnable {
    public final zzea zza;
    public final IObjectWrapper zzb;

    public zzdy(zzea zzea0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzea0;
        this.zzb = iObjectWrapper0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb);
    }
}

