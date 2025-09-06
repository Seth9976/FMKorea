package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

public final class zzgpd implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? Signature.getInstance(s) : Signature.getInstance(s, provider0);
    }
}

