package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

public final class zzgoz implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? KeyFactory.getInstance(s) : KeyFactory.getInstance(s, provider0);
    }
}

