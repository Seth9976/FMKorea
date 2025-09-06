package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class zzbhx implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzbej zzbej0 = ((zzcfi)object0).zzK();
        if(zzbej0 != null) {
            JSONObject jSONObject0 = zzbej0.zzb();
            if(jSONObject0 != null) {
                ((zzcfi)object0).zze("nativeClickMetaReady", jSONObject0);
                return;
            }
        }
        ((zzcfi)object0).zze("nativeClickMetaReady", new JSONObject());
    }
}

