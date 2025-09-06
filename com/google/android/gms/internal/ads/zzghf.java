package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;

public final class zzghf {
    private static final ThreadLocal zza;

    static {
        zzghf.zza = new zzghe();
    }

    static SecureRandom zza() {
        SecureRandom secureRandom0 = zzghf.zzc();
        secureRandom0.nextLong();
        return secureRandom0;
    }

    public static byte[] zzb(int v) [...] // 潜在的解密器

    private static SecureRandom zzc() {
        try {
            return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
        }
        catch(GeneralSecurityException unused_ex) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            }
            catch(GeneralSecurityException unused_ex) {
                try {
                    return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                }
                catch(GeneralSecurityException unused_ex) {
                    return new SecureRandom();
                }
            }
        }
    }
}

