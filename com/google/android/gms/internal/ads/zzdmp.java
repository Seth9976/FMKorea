package com.google.android.gms.internal.ads;

import Z1.d;
import org.json.JSONObject;

public final class zzdmp implements zzfxl {
    public final zzdnb zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzdmp(zzdnb zzdnb0, String s, JSONObject jSONObject0) {
        this.zza = zzdnb0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzc(this.zzb, this.zzc, ((zzcfi)object0));
    }
}

