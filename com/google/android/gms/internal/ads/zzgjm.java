package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjm implements zzggo {
    public static final zzgjm zza;

    static {
        zzgjm.zza = new zzgjm();
    }

    @Override  // com.google.android.gms.internal.ads.zzggo
    public final zzghh zza(zzgah zzgah0) {
        zzgnw zzgnw0;
        int v;
        zzgmu zzgmu0 = zzgmv.zza();
        zzgmu0.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgmh zzgmh0 = zzgmi.zzd();
        zzgmk zzgmk0 = zzgml.zzc();
        zzgmk0.zza(((zzgjc)zzgah0).zza());
        zzgiz zzgiz0 = ((zzgjc)zzgah0).zze();
        if(zzgiz.zza.equals(zzgiz0)) {
            v = 3;
        }
        else {
            if(zzgiz.zzb.equals(zzgiz0)) {
                v = 7;
                goto label_20;
            }
            if(zzgiz.zzc.equals(zzgiz0)) {
                v = 5;
                goto label_20;
            }
            if(zzgiz.zzd.equals(zzgiz0)) {
                v = 4;
            }
            else if(zzgiz.zze.equals(zzgiz0)) {
                v = 6;
            }
            else {
                throw new GeneralSecurityException("Unable to serialize HashType " + zzgiz0);
            }
        }
    label_20:
        zzgmk0.zzb(v);
        zzgmh0.zzb(((zzgml)zzgmk0.zzal()));
        zzgmh0.zza(((zzgjc)zzgah0).zzb());
        zzgmu0.zzc(((zzgmi)zzgmh0.zzal()).zzau());
        zzgja zzgja0 = ((zzgjc)zzgah0).zzf();
        if(zzgja.zza.equals(zzgja0)) {
            zzgnw0 = zzgnw.zzb;
        }
        else {
            if(zzgja.zzb.equals(zzgja0)) {
                zzgnw0 = zzgnw.zze;
                zzgmu0.zza(zzgnw0);
                return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
            }
            if(zzgja.zzd.equals(zzgja0)) {
                zzgnw0 = zzgnw.zzd;
            }
            else if(zzgja.zzc.equals(zzgja0)) {
                zzgnw0 = zzgnw.zzc;
            }
            else {
                throw new GeneralSecurityException("Unable to serialize variant: " + zzgja0);
            }
        }
        zzgmu0.zza(zzgnw0);
        return zzghd.zzb(((zzgmv)zzgmu0.zzal()));
    }
}

