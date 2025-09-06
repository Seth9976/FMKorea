package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

public final class zzdza implements zzffh {
    public static final zzdza zza;

    static {
        zzdza.zza = new zzdza();
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        zze.zza("Ad request signals:");
        zze.zza(((JSONObject)object0).toString(2));
        return (JSONObject)object0;
    }
}

