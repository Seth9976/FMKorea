package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public final class zzdym implements zzffh {
    public final JSONObject zza;
    public final zzbuq zzb;

    public zzdym(JSONObject jSONObject0, zzbuq zzbuq0) {
        this.zza = jSONObject0;
        this.zzb = zzbuq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        return new zzdzn(zzeab.zza(new InputStreamReader(((InputStream)object0))), this.zza, this.zzb);
    }
}

