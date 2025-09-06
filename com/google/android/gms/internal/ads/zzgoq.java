package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

final class zzgoq implements zzgov {
    private final zzgpe zza;

    zzgoq(zzgpe zzgpe0, zzgop zzgop0) {
        this.zza = zzgpe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgov
    public final Object zza(String s) {
        Iterator iterator0 = zzgow.zzb(new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"}).iterator();
    label_1:
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Provider provider0 = (Provider)object0;
            try {
                return this.zza.zza(s, provider0);
            }
            catch(Exception unused_ex) {
                goto label_1;
            }
        }
        return this.zza.zza(s, null);
    }
}

