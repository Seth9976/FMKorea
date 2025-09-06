package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzevr implements zzesi {
    public static final zzevr zza;

    static {
        zzevr.zza = new zzevr();
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.getJSONObject("sdk_env").put("container_version", 12451000);
        }
        catch(JSONException unused_ex) {
        }
    }
}

