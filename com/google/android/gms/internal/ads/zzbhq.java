package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import java.util.Map;

public final class zzbhq implements zzbir {
    public static final zzbhq zza;

    static {
        zzbhq.zza = new zzbhq();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("u");
        if(s == null) {
            zzcaa.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        new zzby(((zzcgj)object0).getContext(), ((zzcgr)(((zzcgj)object0))).zzn().zza, s).zzb();
    }
}

