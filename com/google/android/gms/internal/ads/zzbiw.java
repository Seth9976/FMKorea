package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbiw implements zzbir {
    private final Context zza;

    public zzbiw(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(!zzt.zzn().zzu(this.zza)) {
            return;
        }
        String s = (String)map0.get("eventName");
        String s1 = (String)map0.get("eventId");
        switch(s) {
            case "_aa": {
                zzt.zzn().zzk(this.zza, s1);
                return;
            }
            case "_ac": {
                zzt.zzn().zzm(this.zza, s1);
                return;
            }
            case "_ai": {
                zzt.zzn().zzn(this.zza, s1);
                return;
            }
            default: {
                zzcaa.zzg("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}

