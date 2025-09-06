package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcgc implements Runnable {
    public final zzcge zza;
    public final Map zzb;

    public zzcgc(zzcge zzcge0, Map map0) {
        this.zza = zzcge0;
        this.zzb = map0;
    }

    @Override
    public final void run() {
        this.zza.zzr(this.zzb);
    }
}

