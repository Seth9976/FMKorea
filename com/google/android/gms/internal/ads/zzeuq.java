package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuq implements zzesi {
    private final JSONObject zza;

    public zzeuq(JSONObject jSONObject0) {
        this.zza = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("cache_state", this.zza);
        }
        catch(JSONException unused_ex) {
            zze.zza("Unable to get cache_state");
        }
    }
}

