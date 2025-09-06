package com.google.android.gms.internal.ads;

import Z1.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdwk implements zzfxl {
    public final zzdwn zza;
    public final String zzb;
    public final String zzc;

    public zzdwk(zzdwn zzdwn0, String s, String s1) {
        this.zza = zzdwn0;
        this.zzb = s;
        this.zzc = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        String s = (String)object0;
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("headers", new JSONObject());
            jSONObject2.put("body", this.zzb);
            jSONObject1.put("base_url", "");
            jSONObject1.put("signals", new JSONObject(this.zzc));
            jSONObject0.put("request", jSONObject1);
            jSONObject0.put("response", jSONObject2);
            jSONObject0.put("flags", new JSONObject());
            return zzfye.zzh(jSONObject0);
        }
        catch(JSONException jSONException0) {
            throw new JSONException("Preloaded loader: " + jSONException0.getCause());
        }
    }
}

