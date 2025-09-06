package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbhp implements zzbir {
    public static final zzbhp zza;

    static {
        zzbhp.zza = new zzbhp();
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcgq zzcgq0 = (zzcgq)object0;
        String s = (String)map0.get("tx");
        String s1 = (String)map0.get("ty");
        String s2 = (String)map0.get("td");
        try {
            int v = Integer.parseInt(s);
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            zzaqx zzaqx0 = zzcgq0.zzI();
            if(zzaqx0 != null) {
                zzaqx0.zzc().zzl(v, v1, v2);
            }
        }
        catch(NumberFormatException unused_ex) {
            zzcaa.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}

