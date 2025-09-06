package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzetl implements zzesi {
    private final String zza;

    public zzetl(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("ms", this.zza);
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed putting Ad ID.", jSONException0);
        }
    }
}

