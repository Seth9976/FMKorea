package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjk implements zzgik {
    private final zzghu zza;

    public zzgjk(zzghu zzghu0) {
        if(!zzgfj.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzghu0;
    }
}

