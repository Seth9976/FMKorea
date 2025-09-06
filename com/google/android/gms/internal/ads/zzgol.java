package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgol implements zzfzi {
    private final zzgez zza;

    public zzgol(byte[] arr_b) {
        if(!zzgfj.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = new zzgez(arr_b, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        return this.zza.zza(arr_b2, arr_b, arr_b1);
    }
}

