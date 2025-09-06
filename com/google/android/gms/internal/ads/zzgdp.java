package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgdp implements zzggo {
    public static final zzgdp zza;

    static {
        zzgdp.zza = new zzgdp();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzglt zzglt0 = zzglu.zzd();
        zzglt0.zza(((zzgdo)zzgah0).zza());
        zzgmu0.zzc(((zzglu)zzglt0.zzal()).zzau());
        zzgdm zzgdm0 = ((zzgdo)zzgah0).zzb();
        if(zzgdm.zza.equals(zzgdm0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgdm.zzb.equals(zzgdm0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgdm.zzc.equals(zzgdm0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgdm0);
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

