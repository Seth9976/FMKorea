package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgfk {
    private static final Logger zza;
    private static final AtomicBoolean zzb;

    static {
        zzgfk.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgfk");
        zzgfk.zzb = new AtomicBoolean(false);
    }

    static Boolean zza() {
        try {
            return (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            zzgfk.zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return false;
        }
    }

    public static boolean zzb() {
        return zzgfk.zzb.get();
    }
}

