package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

public final class zzgpc implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? MessageDigest.getInstance(s) : MessageDigest.getInstance(s, provider0);
    }
}

