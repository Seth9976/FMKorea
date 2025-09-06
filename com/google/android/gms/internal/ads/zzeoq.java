package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

public final class zzeoq implements zzesi {
    private final JSONObject zza;
    private final JSONObject zzb;

    public zzeoq(JSONObject jSONObject0, JSONObject jSONObject1) {
        this.zza = jSONObject0;
        this.zzb = jSONObject1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = this.zza;
        if(jSONObject0 != null) {
            ((Bundle)object0).putString("fwd_cld", jSONObject0.toString());
        }
        JSONObject jSONObject1 = this.zzb;
        if(jSONObject1 != null) {
            ((Bundle)object0).putString("fwd_common_cld", jSONObject1.toString());
        }
    }
}

