package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class zzgpa implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? KeyPairGenerator.getInstance(s) : KeyPairGenerator.getInstance(s, provider0);
    }
}

