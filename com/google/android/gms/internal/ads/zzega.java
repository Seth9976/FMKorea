package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzega implements zzedp {
    private final zzdpc zza;

    public zzega(zzdpc zzdpc0) {
        this.zza = zzdpc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String s, JSONObject jSONObject0) {
        return new zzedq(this.zza.zzc(s, jSONObject0), new zzefj(), s);
    }
}

