package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

public final class zzenk implements zzfqw {
    public static final zzenk zza;

    static {
        zzenk.zza = new zzenk();
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return new zzeno(((AppSetIdInfo)object0).getId(), ((AppSetIdInfo)object0).getScope());
    }
}

