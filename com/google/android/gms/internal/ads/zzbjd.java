package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

public final class zzbjd implements zzbir {
    private final zzduy zza;

    public zzbjd(zzduy zzduy0) {
        this.zza = zzduy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            return;
        }
        String s = (String)map0.get("action");
        String s1 = (String)map0.get("adUnitId");
        String s2 = (String)map0.get("redirectUrl");
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
            String s3 = (String)map0.get("format");
            if(s.equals("load") && !TextUtils.isEmpty(s3)) {
                this.zza.zzh(s1, s3, s2);
                return;
            }
            if(s.equals("show")) {
                this.zza.zzi(s1, s2);
            }
        }
    }
}

