package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjd {
    @Deprecated
    static final zzgnz zza;
    @Deprecated
    static final zzgnz zzb;
    @Deprecated
    static final zzgnz zzc;

    static {
        new zzgiw();
        zzgnz zzgnz0 = zzgnz.zzc();
        zzgjd.zza = zzgnz0;
        zzgjd.zzb = zzgnz0;
        zzgjd.zzc = zzgnz0;
        try {
            zzgjd.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new ExceptionInInitializerError(generalSecurityException0);
        }
    }

    public static void zza() {
        zzgji.zze();
        zzgin.zzd();
        zzgiw.zzh(true);
        if(zzgfk.zzb()) {
            return;
        }
        zzghz.zzm(true);
    }
}

