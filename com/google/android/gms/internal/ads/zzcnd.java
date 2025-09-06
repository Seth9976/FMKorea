package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;

public final class zzcnd implements zzcmt {
    private final zzdue zza;

    zzcnd(zzdue zzdue0) {
        this.zza = zzdue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmt
    public final void zza(JSONObject jSONObject0) {
        if(jSONObject0 != null && ((Boolean)zzba.zzc().zzb(zzbbr.zziP)).booleanValue()) {
            this.zza.zzm(jSONObject0);
        }
    }
}

