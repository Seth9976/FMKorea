package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgcy implements zzggo {
    public static final zzgcy zza;

    static {
        zzgcy.zza = new zzgcy();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgln zzgln0 = zzglo.zzd();
        zzgln0.zza(((zzgcx)zzgah0).zza());
        zzgmu0.zzc(((zzglo)zzgln0.zzal()).zzau());
        zzgcv zzgcv0 = ((zzgcx)zzgah0).zzb();
        if(zzgcv.zza.equals(zzgcv0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgcv.zzb.equals(zzgcv0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgcv.zzc.equals(zzgcv0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgcv0);
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

