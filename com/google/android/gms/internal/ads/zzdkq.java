package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdkq implements Callable {
    public final zzdks zza;
    public final zzfbr zzb;
    public final zzfbe zzc;
    public final JSONObject zzd;

    public zzdkq(zzdks zzdks0, zzfbr zzfbr0, zzfbe zzfbe0, JSONObject jSONObject0) {
        this.zza = zzdks0;
        this.zzb = zzfbr0;
        this.zzc = zzfbe0;
        this.zzd = jSONObject0;
    }

    @Override
    public final Object call() {
        zzfbe zzfbe0 = this.zzc;
        JSONObject jSONObject0 = this.zzd;
        zzdic zzdic0 = new zzdic();
        zzdic0.zzaa(jSONObject0.optInt("template_id", -1));
        zzdic0.zzK(jSONObject0.optString("custom_template_id"));
        JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
        zzdic0.zzV((jSONObject1 == null ? null : jSONObject1.optString("omid_partner_name")));
        zzfca zzfca0 = this.zzb.zza.zza;
        String s = Integer.toString(zzdic0.zzc());
        if(!zzfca0.zzg.contains(s)) {
            throw new zzehf(1, "Invalid template ID: " + zzdic0.zzc());
        }
        if(zzdic0.zzc() == 3) {
            if(zzdic0.zzA() == null) {
                throw new zzehf(1, "No custom template id for custom template ad response.");
            }
            String s1 = zzdic0.zzA();
            if(!zzfca0.zzh.contains(s1)) {
                throw new zzehf(1, "Unexpected custom template id in the response.");
            }
        }
        zzdic0.zzY(jSONObject0.optDouble("rating", -1.0));
        String s2 = jSONObject0.optString("headline", null);
        if(zzfbe0.zzN) {
            s2 = zzs.zzv() + " : " + s2;
        }
        zzdic0.zzZ("headline", s2);
        zzdic0.zzZ("body", jSONObject0.optString("body", null));
        zzdic0.zzZ("call_to_action", jSONObject0.optString("call_to_action", null));
        zzdic0.zzZ("store", jSONObject0.optString("store", null));
        zzdic0.zzZ("price", jSONObject0.optString("price", null));
        zzdic0.zzZ("advertiser", jSONObject0.optString("advertiser", null));
        return zzdic0;
    }
}

