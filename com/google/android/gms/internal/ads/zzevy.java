package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevy implements zzesi {
    private final String zza;

    public zzevy(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            if(!TextUtils.isEmpty(this.zza)) {
                zzbu.zzf(jSONObject0, "pii").put("adsid", this.zza);
            }
        }
        catch(JSONException jSONException0) {
            zzcaa.zzk("Failed putting trustless token.", jSONException0);
        }
    }
}

