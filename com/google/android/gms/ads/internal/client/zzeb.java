package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

public final class zzeb implements InitializationStatus {
    public final zzej zza;

    public zzeb(zzej zzej0) {
        this.zza = zzej0;
    }

    @Override  // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        Map map0 = new HashMap();
        map0.put("com.google.android.gms.ads.MobileAds", new zzee(this.zza));
        return map0;
    }
}

