package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONObject;

public final class zzeag {
    private final zzbuy zza;

    zzeag(zzbuy zzbuy0) {
        this.zza = zzbuy0;
    }

    public static void zza(Map map0, JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("pii");
        if(jSONObject1 != null) {
            if(!TextUtils.isEmpty(jSONObject1.optString("doritos", ""))) {
                map0.put("x-afma-drt-cookie", jSONObject1.optString("doritos", ""));
            }
            if(!TextUtils.isEmpty(jSONObject1.optString("doritos_v2", ""))) {
                map0.put("x-afma-drt-v2-cookie", jSONObject1.optString("doritos_v2", ""));
            }
            return;
        }
        zze.zza("DSID signal does not exist.");
    }

    public final void zzb() {
        zzcaq.zza(this.zza.zza(), "persistFlags");
    }
}

