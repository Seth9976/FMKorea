package com.google.android.gms.ads.internal.overlay;

import java.util.Map;

public final class zzu implements Runnable {
    public final zzw zza;
    public final String zzb;
    public final Map zzc;

    public zzu(zzw zzw0, String s, Map map0) {
        this.zza = zzw0;
        this.zzb = s;
        this.zzc = map0;
    }

    @Override
    public final void run() {
        this.zza.zzh(this.zzb, this.zzc);
    }
}

