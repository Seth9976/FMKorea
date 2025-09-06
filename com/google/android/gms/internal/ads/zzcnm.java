package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class zzcnm implements zzcmt {
    private final zzbxh zza;

    zzcnm(zzbxh zzbxh0) {
        this.zza = zzbxh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(JSONObject jSONObject0) {
        long v = jSONObject0.optLong("timestamp");
        boolean z = jSONObject0.optBoolean("npa_reset") ? true : jSONObject0.optBoolean("npa");
        this.zza.zzb(((int)z), v);
    }
}

