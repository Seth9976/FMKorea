package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjl implements zzgik {
    private final zzgir zza;

    public zzgjl(zzgir zzgir0) {
        if(!zzgfj.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgir0;
    }
}

