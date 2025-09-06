package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

public final class zzdkw implements zzfqw {
    public final zzdlf zza;
    public final JSONObject zzb;

    public zzdkw(zzdlf zzdlf0, JSONObject jSONObject0) {
        this.zza = zzdlf0;
        this.zzb = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return this.zza.zza(this.zzb, ((List)object0));
    }
}

