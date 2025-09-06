package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgch implements zzggo {
    public static final zzgch zza;

    static {
        zzgch.zza = new zzgch();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgle zzgle0 = zzglf.zzc();
        zzglh zzglh0 = zzgli.zzc();
        zzglh0.zza(((zzgcg)zzgah0).zza());
        zzgle0.zzb(((zzgli)zzglh0.zzal()));
        zzgle0.zza(((zzgcg)zzgah0).zzb());
        zzgmu0.zzc(((zzglf)zzgle0.zzal()).zzau());
        zzgce zzgce0 = ((zzgcg)zzgah0).zzc();
        if(zzgce.zza.equals(zzgce0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgce.zzb.equals(zzgce0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgce.zzc.equals(zzgce0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgce0);
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

