package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfqw;
import org.json.JSONObject;

public final class zzv implements zzfqw {
    public static final zzv zza;

    static {
        zzv.zza = new zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        return ((JSONObject)object0).optString("nas");
    }
}

