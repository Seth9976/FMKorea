package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeub implements zzesi {
    private final JSONObject zza;

    public zzeub(JSONObject jSONObject0) {
        this.zza = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "content_info");
            JSONObject jSONObject2 = this.zza;
            Iterator iterator0 = jSONObject2.keys();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                jSONObject1.put(((String)object1), jSONObject2.get(((String)object1)));
            }
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting app indexing json.");
        }
    }
}

