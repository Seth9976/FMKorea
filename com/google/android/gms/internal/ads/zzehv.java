package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzehv implements zzedp {
    private final Map zza;
    private final zzdpc zzb;

    public zzehv(zzdpc zzdpc0) {
        this.zza = new HashMap();
        this.zzb = zzdpc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String s, JSONObject jSONObject0) {
        synchronized(this) {
            zzedq zzedq0 = (zzedq)this.zza.get(s);
            if(zzedq0 == null) {
                zzedq0 = new zzedq(this.zzb.zzc(s, jSONObject0), new zzefk(), s);
                this.zza.put(s, zzedq0);
            }
            return zzedq0;
        }
    }
}

