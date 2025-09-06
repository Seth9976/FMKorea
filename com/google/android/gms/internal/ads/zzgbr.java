package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgbr {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgbr.zzb = zzgpo0;
        zzgbr.zzc = zzggq.zzb(zzgbn.zza, zzgbm.class, zzghd.class);
        zzgbr.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzgkq zzgkq0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzgkq0 = zzgkq.zzd(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", zzgsc0);
            }
            if(zzgkq0.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgbi zzgbi0 = new zzgbi(null);
            zzgbi0.zza(zzgkq0.zze().zza());
            zzgbi0.zzc(zzgkq0.zzf().zza());
            zzgbi0.zzd(zzgkq0.zze().zzg().zza());
            zzgbi0.zze(zzgkq0.zzf().zzh().zza());
            zzgbi0.zzb(zzgbr.zze(zzgkq0.zzf().zzh().zzg()));
            zzgbi0.zzf(zzgbr.zzd(zzghd0.zzc().zzf()));
            return zzgbi0.zzg();
        }, zzgpo0, zzghd.class);
        zzgbr.zze = zzgft.zza(zzgbp.zza, zzgbd.class, zzghc.class);
        zzgbr.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                try {
                    zzgkn zzgkn0 = zzgkn.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzgkn0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if(zzgkn0.zzf().zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if(zzgkn0.zzg().zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zzgbi zzgbi0 = new zzgbi(null);
                    zzgbi0.zza(zzgkn0.zzf().zzh().zzd());
                    zzgbi0.zzc(zzgkn0.zzg().zzh().zzd());
                    zzgbi0.zzd(zzgkn0.zzf().zzg().zza());
                    zzgbi0.zze(zzgkn0.zzg().zzg().zza());
                    zzgbi0.zzb(zzgbr.zze(zzgkn0.zzg().zzg().zzg()));
                    zzgbi0.zzf(zzgbr.zzd(zzghc0.zzc()));
                    zzgbm zzgbm0 = zzgbi0.zzg();
                    zzgbb zzgbb0 = new zzgbb(null);
                    zzgbb0.zzd(zzgbm0);
                    zzgbb0.zza(zzgpp.zzb(zzgkn0.zzf().zzh().zzA(), zzgas0));
                    zzgbb0.zzb(zzgpp.zzb(zzgkn0.zzg().zzh().zzA(), zzgas0));
                    zzgbb0.zzc(zzghc0.zzf());
                    return zzgbb0.zze();
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgbd zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgbm zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgbr.zzc);
        zzggi0.zzg(zzgbr.zzd);
        zzggi0.zzf(zzgbr.zze);
        zzggi0.zze(zzgbr.zzf);
    }

    private static zzgbk zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgbk.zza;
            }
            case 3: {
                return zzgbk.zzc;
            }
            case 2: 
            case 4: {
                return zzgbk.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }

    private static zzgbj zze(int v) {
        switch(v - 2) {
            case 1: {
                return zzgbj.zza;
            }
            case 2: {
                return zzgbj.zzd;
            }
            case 3: {
                return zzgbj.zzc;
            }
            case 4: {
                return zzgbj.zze;
            }
            case 5: {
                return zzgbj.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(v));
            }
        }
    }
}

