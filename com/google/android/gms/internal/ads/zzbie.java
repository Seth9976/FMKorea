package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

final class zzbie implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        try {
            String s = (String)map0.get("enabled");
            if(!zzfqo.zzc("true", s) && !zzfqo.zzc("false", s)) {
                return;
            }
            zzfoj.zzi(zzcfi0.getContext()).zzm(Boolean.parseBoolean(s));
            return;
        }
        catch(IOException iOException0) {
        }
        zzt.zzo().zzu(iOException0, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
    }
}

