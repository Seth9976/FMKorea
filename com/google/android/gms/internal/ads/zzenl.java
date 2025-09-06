package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.appset.AppSetIdInfo;

public final class zzenl implements zzfxl {
    public static final zzenl zza;

    static {
        zzenl.zza = new zzenl();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return ((AppSetIdInfo)object0) == null ? zzfye.zzh(new zzeno(null, -1)) : zzfye.zzh(new zzeno(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope()));
    }
}

