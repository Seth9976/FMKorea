package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

public final class zzggc {
    public static final zzgju zza;

    static {
        zzggc.zza = new zzggb(null);
    }

    public static zzgka zza(zzgao zzgao0) {
        zzfzu zzfzu0;
        zzgjw zzgjw0 = new zzgjw();
        zzgjw0.zzb(zzgao0.zzb());
        for(Object object0: zzgao0.zzd()) {
            for(Object object1: ((List)object0)) {
                switch(((zzgak)object1).zzh() - 2) {
                    case 1: {
                        zzfzu0 = zzfzu.zza;
                        break;
                    }
                    case 2: {
                        zzfzu0 = zzfzu.zzb;
                        break;
                    }
                    case 3: {
                        zzfzu0 = zzfzu.zzc;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown key status");
                    }
                }
                int v = ((zzgak)object1).zza();
                String s = ((zzgak)object1).zzf();
                if(s.startsWith("type.googleapis.com/google.crypto.")) {
                    s = s.substring(34);
                }
                zzgjw0.zza(zzfzu0, v, s, ((zzgak)object1).zzc().name());
            }
        }
        if(zzgao0.zza() != null) {
            zzgjw0.zzc(zzgao0.zza().zza());
        }
        try {
            return zzgjw0.zzd();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

