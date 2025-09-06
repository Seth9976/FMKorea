package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int v, String s, String s1, AdError adError0, ResponseInfo responseInfo0) {
        super(v, s, s1, adError0);
        this.zza = responseInfo0;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return this.zzb().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    @Override  // com.google.android.gms.ads.AdError
    public final JSONObject zzb() {
        JSONObject jSONObject0 = super.zzb();
        ResponseInfo responseInfo0 = this.getResponseInfo();
        if(responseInfo0 == null) {
            jSONObject0.put("Response Info", "null");
            return jSONObject0;
        }
        jSONObject0.put("Response Info", responseInfo0.zzd());
        return jSONObject0;
    }
}

