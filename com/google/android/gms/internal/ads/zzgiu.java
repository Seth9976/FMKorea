package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class zzgiu extends zzggv {
    zzgiu(Class class0) {
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzggv
    public final Object zza(zzgta zzgta0) {
        int v = ((zzgmf)zzgta0).zzg().zzg();
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(((zzgmf)zzgta0).zzh().zzA(), "HMAC");
        int v1 = ((zzgmf)zzgta0).zzg().zza();
        switch(v - 2) {
            case 1: {
                return new zzgpk(new zzgpj("HMACSHA1", secretKeySpec0), v1);
            }
            case 2: {
                return new zzgpk(new zzgpj("HMACSHA384", secretKeySpec0), v1);
            }
            case 3: {
                return new zzgpk(new zzgpj("HMACSHA256", secretKeySpec0), v1);
            }
            case 4: {
                return new zzgpk(new zzgpj("HMACSHA512", secretKeySpec0), v1);
            }
            case 5: {
                return new zzgpk(new zzgpj("HMACSHA224", secretKeySpec0), v1);
            }
            default: {
                throw new GeneralSecurityException("unknown hash");
            }
        }
    }
}

