package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

final class zzdzm implements zzbnb {
    @Override  // com.google.android.gms.internal.ads.zzbnb
    public final JSONObject zzb(Object object0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
            jSONObject1.put("ad_request_url", ((zzdzn)object0).zzd.zze());
            jSONObject1.put("ad_request_post_body", ((zzdzn)object0).zzd.zzd());
        }
        jSONObject1.put("base_url", ((zzdzn)object0).zzd.zzb());
        jSONObject1.put("signals", ((zzdzn)object0).zzc);
        jSONObject2.put("body", ((zzdzn)object0).zzb.zzc);
        jSONObject2.put("headers", zzay.zzb().zzi(((zzdzn)object0).zzb.zzb));
        jSONObject2.put("response_code", ((zzdzn)object0).zzb.zza);
        jSONObject2.put("latency", ((zzdzn)object0).zzb.zzd);
        jSONObject0.put("request", jSONObject1);
        jSONObject0.put("response", jSONObject2);
        jSONObject0.put("flags", ((zzdzn)object0).zzd.zzg());
        return jSONObject0;
    }
}

