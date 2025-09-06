package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.ExecutionException;

public final class zzdya implements zzfxl {
    public static final zzdya zza;

    static {
        zzdya.zza = new zzdya();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        Throwable throwable0 = (ExecutionException)object0;
        if(throwable0.getCause() != null) {
            throwable0 = throwable0.getCause();
        }
        return zzfye.zzg(throwable0);
    }
}

