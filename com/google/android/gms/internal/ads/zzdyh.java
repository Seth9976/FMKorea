package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyh implements zzfqw {
    public final zzdyi zza;
    public final zzbun zzb;

    public zzdyh(zzdyi zzdyi0, zzbun zzbun0) {
        this.zza = zzdyi0;
        this.zzb = zzbun0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        Bundle bundle0 = this.zzb.zza;
        if(bundle0 != null) {
            try {
                JSONObject jSONObject1 = zzay.zzb().zzh(bundle0);
                try {
                    zzay.zzb().zzk(jSONObject0, jSONObject1);
                    return jSONObject0;
                }
                catch(JSONException unused_ex) {
                    return jSONObject1;
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        return jSONObject0;
    }
}

