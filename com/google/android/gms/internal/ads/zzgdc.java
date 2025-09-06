package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgdc {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgdc.zzb = zzgpo0;
        zzgdc.zzc = zzggq.zzb(zzgcy.zza, zzgcx.class, zzghd.class);
        zzgdc.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzglo zzglo0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzglo0 = zzglo.zzf(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", zzgsc0);
            }
            if(zzglo0.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgcu zzgcu0 = new zzgcu(null);
            zzgcu0.zzb(zzglo0.zza());
            zzgcu0.zza(12);
            zzgcu0.zzc(16);
            zzgcu0.zzd(zzgdc.zzd(zzghd0.zzc().zzf()));
            return zzgcu0.zze();
        }, zzgpo0, zzghd.class);
        zzgdc.zze = zzgft.zza(zzgda.zza, zzgcp.class, zzghc.class);
        zzgdc.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                try {
                    zzgll zzgll0 = zzgll.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzgll0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgcu zzgcu0 = new zzgcu(null);
                    zzgcu0.zzb(zzgll0.zzf().zzd());
                    zzgcu0.zza(12);
                    zzgcu0.zzc(16);
                    zzgcu0.zzd(zzgdc.zzd(zzghc0.zzc()));
                    zzgcx zzgcx0 = zzgcu0.zze();
                    zzgcn zzgcn0 = new zzgcn(null);
                    zzgcn0.zzc(zzgcx0);
                    zzgcn0.zzb(zzgpp.zzb(zzgll0.zzf().zzA(), zzgas0));
                    zzgcn0.zza(zzghc0.zzf());
                    return zzgcn0.zzd();
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgcp zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgcx zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgdc.zzc);
        zzggi0.zzg(zzgdc.zzd);
        zzggi0.zzf(zzgdc.zze);
        zzggi0.zze(zzgdc.zzf);
    }

    private static zzgcv zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgcv.zza;
            }
            case 3: {
                return zzgcv.zzc;
            }
            case 2: 
            case 4: {
                return zzgcv.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

