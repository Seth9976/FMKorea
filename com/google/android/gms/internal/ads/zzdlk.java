package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdlk {
    private final Executor zza;
    private final zzdlf zzb;

    public zzdlk(Executor executor0, zzdlf zzdlf0) {
        this.zza = executor0;
        this.zzb = zzdlf0;
    }

    public final d zza(JSONObject jSONObject0, String s) {
        d d0;
        JSONArray jSONArray0 = jSONObject0.optJSONArray("custom_assets");
        if(jSONArray0 == null) {
            return zzfye.zzh(Collections.emptyList());
        }
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
            if(jSONObject1 == null) {
                d0 = zzfye.zzh(null);
            }
            else {
                String s1 = jSONObject1.optString("name");
                if(s1 == null) {
                    d0 = zzfye.zzh(null);
                }
                else {
                    String s2 = jSONObject1.optString("type");
                    if("string".equals(s2)) {
                        d0 = zzfye.zzh(new zzdlj(s1, jSONObject1.optString("string_value")));
                    }
                    else {
                        d0 = "image".equals(s2) ? zzfye.zzm(this.zzb.zze(jSONObject1, "image_value"), new zzdlh(s1), this.zza) : zzfye.zzh(null);
                    }
                }
            }
            arrayList0.add(d0);
        }
        return zzfye.zzm(zzfye.zzd(arrayList0), zzdli.zza, this.zza);
    }
}

