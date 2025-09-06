package com.google.android.gms.internal.ads;

import Z1.d;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdzs implements zzfxl {
    public static final zzdzs zza;

    static {
        zzdzs.zza = new zzdzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        zzeab zzeab0 = (zzeab)object0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("response", zzeab0.zza);
            JSONObject jSONObject1 = new JSONObject();
            for(Object object1: zzeab0.zzb.keySet()) {
                String s = (String)object1;
                if(s != null) {
                    List list0 = (List)zzeab0.zzb.get(s);
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object2: list0) {
                        String s1 = (String)object2;
                        if(s1 != null) {
                            jSONArray0.put(s1);
                        }
                    }
                    jSONObject1.put(s, jSONArray0);
                }
            }
            jSONObject0.put("headers", jSONObject1);
            String s2 = zzeab0.zzc;
            if(s2 != null) {
                jSONObject0.put("body", s2);
            }
            jSONObject0.put("latency", zzeab0.zzd);
            return zzfye.zzh(new ByteArrayInputStream(jSONObject0.toString().getBytes(StandardCharsets.UTF_8)));
        }
        catch(JSONException jSONException0) {
        }
        zzcaa.zzj(("Error converting response to JSONObject: " + jSONException0.getMessage()));
        throw new JSONException("Parsing HTTP Response: " + jSONException0.getCause());
    }
}

