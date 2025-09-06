package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeum implements zzesi {
    private final String zza;

    public zzeum(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
            if(!TextUtils.isEmpty(this.zza)) {
                jSONObject1.put("attok", this.zza);
            }
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed putting attestation token.", jSONException0);
        }
    }
}

