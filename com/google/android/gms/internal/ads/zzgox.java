package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

public final class zzgox implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? Cipher.getInstance(s) : Cipher.getInstance(s, provider0);
    }
}

