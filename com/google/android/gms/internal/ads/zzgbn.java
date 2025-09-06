package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgbn implements zzggo {
    public static final zzgbn zza;

    static {
        zzgbn.zza = new zzgbn();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        int v;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgkp zzgkp0 = zzgkq.zza();
        zzgkv zzgkv0 = zzgkw.zzc();
        zzgky zzgky0 = zzgkz.zzc();
        zzgky0.zza(((zzgbm)zzgah0).zzc());
        zzgkv0.zzb(((zzgkz)zzgky0.zzal()));
        zzgkv0.zza(((zzgbm)zzgah0).zza());
        zzgkp0.zza(((zzgkw)zzgkv0.zzal()));
        zzgmh zzgmh0 = zzgmi.zzd();
        zzgmk zzgmk0 = zzgml.zzc();
        zzgmk0.zza(((zzgbm)zzgah0).zzd());
        zzgbj zzgbj0 = ((zzgbm)zzgah0).zze();
        if(zzgbj.zza.equals(zzgbj0)) {
            v = 3;
        }
        else {
            if(zzgbj.zzb.equals(zzgbj0)) {
                v = 7;
                goto label_27;
            }
            if(zzgbj.zzc.equals(zzgbj0)) {
                v = 5;
                goto label_27;
            }
            if(zzgbj.zzd.equals(zzgbj0)) {
                v = 4;
            }
            else if(zzgbj.zze.equals(zzgbj0)) {
                v = 6;
            }
            else {
                throw new GeneralSecurityException("Unable to serialize HashType " + zzgbj0);
            }
        }
    label_27:
        zzgmk0.zzb(v);
        zzgmh0.zzb(((zzgml)zzgmk0.zzal()));
        zzgmh0.zza(((zzgbm)zzgah0).zzb());
        zzgkp0.zzb(((zzgmi)zzgmh0.zzal()));
        zzgmu0.zzc(((zzgkq)zzgkp0.zzal()).zzau());
        zzgbk zzgbk0 = ((zzgbm)zzgah0).zzf();
        if(zzgbk.zza.equals(zzgbk0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else if(zzgbk.zzb.equals(zzgbk0)) {
            zzgnw0 = zzgnw.zze;
        }
        else if(zzgbk.zzc.equals(zzgbk0)) {
            zzgnw0 = zzgnw.zzd;
        }
        else {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgbk0);
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

