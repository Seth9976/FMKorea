package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbhi implements zzbir {
    private final zzbhj zza;

    public zzbhi(zzbhj zzbhj0) {
        this.zza = zzbhj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("name");
        if(s == null) {
            zzcaa.zzj("App event with no name parameter.");
            return;
        }
        String s1 = (String)map0.get("info");
        this.zza.zzb(s, s1);
    }
}

