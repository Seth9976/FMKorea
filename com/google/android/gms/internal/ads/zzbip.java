package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbip implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(map0.keySet().contains("start")) {
            ((zzcfi)object0).zzas(true);
        }
        if(map0.keySet().contains("stop")) {
            ((zzcfi)object0).zzas(false);
        }
    }
}

