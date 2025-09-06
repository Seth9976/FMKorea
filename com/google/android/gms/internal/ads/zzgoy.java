package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class zzgoy implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? KeyAgreement.getInstance(s) : KeyAgreement.getInstance(s, provider0);
    }
}

