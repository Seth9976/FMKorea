package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class zzgoi extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return zzgoi.zza();
    }

    protected static final Cipher zza() {
        try {
            return (Cipher)zzgow.zza.zza("AES/ECB/NOPADDING");
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException(generalSecurityException0);
        }
    }
}

