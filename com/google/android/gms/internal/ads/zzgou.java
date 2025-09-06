package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

final class zzgou implements zzgov {
    private final zzgpe zza;

    zzgou(zzgpe zzgpe0, zzgot zzgot0) {
        this.zza = zzgpe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgov
    public final Object zza(String s) {
        Throwable throwable0 = null;
        for(Object object0: zzgow.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"})) {
            Provider provider0 = (Provider)object0;
            try {
                return this.zza.zza(s, provider0);
            }
            catch(Exception exception0) {
                if(throwable0 != null) {
                    continue;
                }
                throwable0 = exception0;
            }
        }
        throw new GeneralSecurityException("No good Provider found.", throwable0);
    }
}

