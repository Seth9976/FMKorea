package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

final class zzgx implements zzo {
    private final String zza;
    private final zzgp zzb;

    zzgx(zzgp zzgp0, String s) {
        this.zzb = zzgp0;
        this.zza = s;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzo
    public final String zza(String s) {
        Map map0 = (Map)this.zzb.zzc.get(this.zza);
        return map0 == null || !map0.containsKey(s) ? null : ((String)map0.get(s));
    }
}

