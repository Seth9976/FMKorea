package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbis implements zzbir {
    private final zzbit zza;

    public zzbis(zzbit zzbit0) {
        this.zza = zzbit0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        boolean z = "1".equals(map0.get("transparentBackground"));
        boolean z1 = "1".equals(map0.get("blur"));
        float f = 0.0f;
        try {
            if(map0.get("blurRadius") != null) {
                f = Float.parseFloat(((String)map0.get("blurRadius")));
            }
        }
        catch(NumberFormatException numberFormatException0) {
            zzcaa.zzh("Fail to parse float", numberFormatException0);
        }
        this.zza.zzc(z);
        this.zza.zzb(z1, f);
        ((zzcfi)object0).zzat(z);
    }
}

