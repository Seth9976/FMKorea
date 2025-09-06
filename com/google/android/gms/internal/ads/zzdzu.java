package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

public final class zzdzu implements zzffh {
    public static final zzdzu zza;

    static {
        zzdzu.zza = new zzdzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        zze.zza("GMS AdRequest Signals: ");
        zze.zza(((JSONObject)object0).toString(2));
        return (JSONObject)object0;
    }
}

