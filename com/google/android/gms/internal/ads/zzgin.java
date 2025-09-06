package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

public final class zzgin implements zzgap {
    private static final zzgin zza;

    static {
        zzgin.zza = new zzgin();
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Class zza() {
        return zzgik.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Class zzb() {
        return zzgik.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Object zzc(zzgao zzgao0) {
        if(zzgao0.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        for(Object object0: zzgao0.zzd()) {
            for(Object object1: ((List)object0)) {
                zzgik zzgik0 = (zzgik)((zzgak)object1).zzd();
            }
        }
        return new zzgim(zzgao0, null);
    }

    static void zzd() {
        zzgar.zzf(zzgin.zza);
    }
}

