package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgea implements zzggo {
    public static final zzgea zza;

    static {
        zzgea.zza = new zzgea();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgmu0.zzc(zzgma.zzc().zzau());
        zzgdy zzgdy0 = ((zzgdz)zzgah0).zza();
        if(zzgdy.zza.equals(zzgdy0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgdy.zzb.equals(zzgdy0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgdy.zzc.equals(zzgdy0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgdy0.toString());
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

