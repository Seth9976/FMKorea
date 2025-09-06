package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfzw {
    public static zzfzv zza(String s) {
        zzfzv zzfzv0 = (zzfzv)zzgar.zzd().get("AES128_GCM");
        if(zzfzv0 == null) {
            throw new GeneralSecurityException("cannot find key template: AES128_GCM");
        }
        return zzfzv0;
    }
}

