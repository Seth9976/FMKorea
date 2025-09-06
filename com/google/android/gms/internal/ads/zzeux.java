package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeux implements zzesi {
    private final String zza;
    private final String zzb;

    public zzeux(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
            jSONObject1.put("doritos", this.zza);
            jSONObject1.put("doritos_v2", this.zzb);
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting doritos string.");
        }
    }
}

