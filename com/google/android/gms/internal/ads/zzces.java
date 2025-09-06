package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzces implements Runnable {
    public final zzccj zza;
    public final Map zzb;

    public zzces(zzccj zzccj0, Map map0) {
        this.zza = zzccj0;
        this.zzb = map0;
    }

    @Override
    public final void run() {
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}

