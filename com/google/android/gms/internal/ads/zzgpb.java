package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

public final class zzgpb implements zzgpe {
    @Override  // com.google.android.gms.internal.ads.zzgpe
    public final Object zza(String s, Provider provider0) {
        return provider0 == null ? Mac.getInstance(s) : Mac.getInstance(s, provider0);
    }
}

