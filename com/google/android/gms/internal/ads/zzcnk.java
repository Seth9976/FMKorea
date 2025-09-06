package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcnk implements zzcms {
    private final zzfbd zza;

    public zzcnk(zzfbd zzfbd0) {
        this.zza = zzfbd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        String s = (String)map0.get("render_in_browser");
        if(!TextUtils.isEmpty(s)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(s));
            }
            catch(Exception exception0) {
                throw new IllegalStateException("Invalid render_in_browser state", exception0);
            }
        }
    }
}

