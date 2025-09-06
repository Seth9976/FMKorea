package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeug implements zzesi {
    final String zza;
    final int zzb;

    public zzeug(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        if(!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
                jSONObject1.put("pvid", this.zza);
                jSONObject1.put("pvid_s", this.zzb);
            }
            catch(JSONException jSONException0) {
                zze.zzb("Failed putting gms core app set ID info.", jSONException0);
            }
        }
    }
}

