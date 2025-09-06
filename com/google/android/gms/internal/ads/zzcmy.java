package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcmy implements zzcms {
    private final zzdue zza;

    zzcmy(zzdue zzdue0) {
        this.zza = zzdue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        String s = (String)map0.get("gesture");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        switch(s) {
            case "flick": {
                this.zza.zzl(zzdua.zzc);
                return;
            }
            case "shake": {
                this.zza.zzl(zzdua.zzb);
                return;
            }
            default: {
                this.zza.zzl(zzdua.zza);
            }
        }
    }
}

