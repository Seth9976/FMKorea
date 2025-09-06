package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class zzcfz implements zzbir {
    final zzcgb zza;

    zzcfz(zzcgb zzcgb0) {
        this.zza = zzcgb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        if(map0 != null) {
            String s = (String)map0.get("height");
            if(!TextUtils.isEmpty(s)) {
                try {
                    int v = Integer.parseInt(s);
                    zzcgb zzcgb0 = this.zza;
                    synchronized(zzcgb0) {
                        zzcgb zzcgb1 = this.zza;
                        if(zzcgb.zzaI(zzcgb1) != v) {
                            zzcgb.zzaL(zzcgb1, v);
                            this.zza.requestLayout();
                        }
                    }
                }
                catch(Exception exception0) {
                    zzcaa.zzk("Exception occurred while getting webview content height", exception0);
                }
            }
        }
    }
}

