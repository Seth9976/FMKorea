package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.TimeoutException;

public final class zzdwg implements zzfxl {
    public static final zzdwg zza;

    static {
        zzdwg.zza = new zzdwg();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        TimeoutException timeoutException0 = (TimeoutException)object0;
        return zzfye.zzg(new zzdve(5));
    }
}

