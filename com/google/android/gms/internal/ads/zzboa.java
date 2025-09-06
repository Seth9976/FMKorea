package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzboa {
    public final List zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final List zzf;
    public final String zzg;
    public final String zzh;

    public zzboa(JSONObject jSONObject0) {
        zzbnz zzbnz0;
        if(zzcaa.zzm(2)) {
            zze.zza(("Mediation Response JSON: " + jSONObject0.toString(2)));
        }
        JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_networks");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        int v = -1;
        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
            try {
                zzbnz0 = new zzbnz(jSONArray0.getJSONObject(v1));
            }
            catch(JSONException unused_ex) {
                continue;
            }
            "banner".equalsIgnoreCase(zzbnz0.zzv);
            arrayList0.add(zzbnz0);
            if(v < 0) {
                for(Object object0: zzbnz0.zzc) {
                    if(((String)object0).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                        v = v1;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        jSONArray0.length();
        this.zza = Collections.unmodifiableList(arrayList0);
        this.zzg = jSONObject0.optString("qdata");
        jSONObject0.optInt("fs_model_type", -1);
        jSONObject0.optLong("timeout_ms", -1L);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("settings");
        if(jSONObject1 != null) {
            jSONObject1.optLong("ad_network_timeout_millis", -1L);
            this.zzb = zzbob.zza(jSONObject1, "click_urls");
            this.zzc = zzbob.zza(jSONObject1, "imp_urls");
            this.zzd = zzbob.zza(jSONObject1, "downloaded_imp_urls");
            this.zze = zzbob.zza(jSONObject1, "nofill_urls");
            this.zzf = zzbob.zza(jSONObject1, "remote_ping_urls");
            jSONObject1.optBoolean("render_in_browser", false);
            jSONObject1.optLong("refresh", -1L);
            zzbvp zzbvp0 = zzbvp.zza(jSONObject1.optJSONArray("rewards"));
            this.zzh = zzbvp0 == null ? null : zzbvp0.zza;
            jSONObject1.optBoolean("use_displayed_impression", false);
            jSONObject1.optBoolean("allow_pub_rendered_attribution", false);
            jSONObject1.optBoolean("allow_pub_owned_ad_view", false);
            jSONObject1.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzh = null;
    }
}

