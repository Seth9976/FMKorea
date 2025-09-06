package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbsi {
    public final boolean zza;
    public final String zzb;

    public zzbsi(boolean z, String s) {
        this.zza = z;
        this.zzb = s;
    }

    public static zzbsi zza(JSONObject jSONObject0) {
        return new zzbsi(jSONObject0.optBoolean("enable_prewarming", false), jSONObject0.optString("prefetch_url", ""));
    }
}

