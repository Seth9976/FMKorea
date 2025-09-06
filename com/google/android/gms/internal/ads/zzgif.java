package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgif implements zzggo {
    public static final zzgif zza;

    static {
        zzgif.zza = new zzgif();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgkg zzgkg0 = zzgkh.zzc();
        zzgkj zzgkj0 = zzgkk.zzc();
        zzgkj0.zza(((zzgie)zzgah0).zza());
        zzgkg0.zzb(((zzgkk)zzgkj0.zzal()));
        zzgkg0.zza(((zzgie)zzgah0).zzb());
        zzgmu0.zzc(((zzgkh)zzgkg0.zzal()).zzau());
        zzgic zzgic0 = ((zzgie)zzgah0).zzd();
        if(zzgic.zza.equals(zzgic0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else {
            if(zzgic.zzb.equals(zzgic0)) {
                zzgnw0 = zzgnw.zze;
                zzgmu0.zza(zzgnw0);
                return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
            }
            if(zzgic.zzd.equals(zzgic0)) {
                zzgnw0 = zzgnw.zzd;
            }
            else if(zzgic.zzc.equals(zzgic0)) {
                zzgnw0 = zzgnw.zzc;
            }
            else {
                throw new GeneralSecurityException("Unable to serialize variant: " + zzgic0);
            }
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

