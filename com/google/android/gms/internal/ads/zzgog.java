package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgog extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgog.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzgow.zza.zza("AES/CTR/NoPadding");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

