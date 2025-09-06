package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcnq implements zzcms {
    private final zzdue zza;

    zzcnq(zzdue zzdue0) {
        this.zza = zzdue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        String s = (String)map0.get("test_mode_enabled");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.zza.zzn(s.equals("true"));
    }
}

