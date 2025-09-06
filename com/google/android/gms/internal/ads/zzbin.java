package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbin implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("action");
        if("pause".equals(s)) {
            ((zzcfi)object0).zzbj();
            return;
        }
        if("resume".equals(s)) {
            ((zzcfi)object0).zzbk();
        }
    }
}

