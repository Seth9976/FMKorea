package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.appset.AppSetIdInfo;

public final class zzeud implements zzfxl {
    public static final zzeud zza;

    static {
        zzeud.zza = new zzeud();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return ((AppSetIdInfo)object0) == null ? zzfye.zzh(new zzeug(null, -1)) : zzfye.zzh(new zzeug(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope()));
    }
}

