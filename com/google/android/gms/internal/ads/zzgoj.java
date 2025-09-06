package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgoj extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgoj.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzgow.zza.zza("AES/CTR/NOPADDING");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

