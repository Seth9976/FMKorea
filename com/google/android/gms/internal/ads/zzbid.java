package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

final class zzbid implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        try {
            zzfoi.zzj(zzcfi0.getContext()).zzk();
            zzfoj.zzi(zzcfi0.getContext()).zzj();
        }
        catch(IOException iOException0) {
            zzt.zzo().zzu(iOException0, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}

