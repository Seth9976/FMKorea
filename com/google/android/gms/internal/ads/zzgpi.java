package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class zzgpi extends ThreadLocal {
    final zzgpj zza;

    zzgpi(zzgpj zzgpj0) {
        this.zza = zzgpj0;
        super();
    }

    @Override
    protected final Object initialValue() {
        return this.zza();
    }

    protected final Mac zza() {
        try {
            Mac mac0 = (Mac)zzgow.zzb.zza(this.zza.zzb);
            mac0.init(this.zza.zzc);
            return mac0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

