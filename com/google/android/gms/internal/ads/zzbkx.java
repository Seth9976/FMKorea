package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

public final class zzbkx implements InitializationStatus {
    private final Map zza;

    public zzbkx(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.zza;
    }
}

