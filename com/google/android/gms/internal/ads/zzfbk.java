package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONObject;

public final class zzfbk {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfbk(JsonReader jsonReader0) {
        JSONObject jSONObject0 = zzbu.zzh(jsonReader0);
        this.zzd = jSONObject0;
        this.zza = jSONObject0.optString("ad_html", null);
        this.zzb = jSONObject0.optString("ad_base_url", null);
        this.zzc = jSONObject0.optJSONObject("ad_json");
    }
}

