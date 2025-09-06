package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzewc implements zzesi {
    private final Map zza;

    public zzewc(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("video_decoders", zzay.zzb().zzi(this.zza));
        }
        catch(JSONException jSONException0) {
            zze.zza(("Could not encode video decoder properties: " + jSONException0.getMessage()));
        }
    }
}

