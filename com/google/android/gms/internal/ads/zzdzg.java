package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

public final class zzdzg implements zzfxl {
    public final zzesm zza;

    public zzdzg(zzesm zzesm0) {
        this.zza = zzesm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        JSONObject jSONObject0 = zzay.zzb().zzh(((Bundle)object0));
        return this.zza.zza(jSONObject0);
    }
}

