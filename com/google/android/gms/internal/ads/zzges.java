package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzges implements zzggo {
    public static final zzges zza;

    static {
        zzges.zza = new zzges();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgmu0.zzc(zzgof.zzd().zzau());
        zzgeq zzgeq0 = ((zzger)zzgah0).zza();
        if(zzgeq.zza.equals(zzgeq0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgeq.zzb.equals(zzgeq0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgeq.zzc.equals(zzgeq0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgeq0.toString());
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

