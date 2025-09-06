package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;

final class zzgji implements zzgap {
    private static final Logger zza;
    private static final byte[] zzb;
    private static final zzgji zzc;

    static {
        zzgji.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgji");
        zzgji.zzb = new byte[]{0};
        zzgji.zzc = new zzgji();
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Class zza() {
        return zzgag.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Class zzb() {
        return zzgag.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgap
    public final Object zzc(zzgao zzgao0) {
        for(Object object0: zzgao0.zzd()) {
            for(Object object1: ((List)object0)) {
                zzgak zzgak0 = (zzgak)object1;
                if(zzgak0.zzb() instanceof zzgje) {
                    zzgje zzgje0 = (zzgje)zzgak0.zzb();
                    zzgpo zzgpo0 = zzgpo.zzb(zzgak0.zzg());
                    if(!zzgpo0.equals(zzgje0.zzc())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + zzgje0.zzb() + " has wrong output prefix (" + zzgje0.zzc().toString() + ") instead of (" + zzgpo0.toString() + ")");
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(false) {
                break;
            }
        }
        return new zzgjh(zzgao0, null);
    }

    public static void zze() {
        zzgar.zzf(zzgji.zzc);
    }

    static byte[] zzf() [...] // 潜在的解密器
}

