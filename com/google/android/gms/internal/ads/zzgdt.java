package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgdt {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgdt.zzb = zzgpo0;
        zzgdt.zzc = zzggq.zzb(zzgdp.zza, zzgdo.class, zzghd.class);
        zzgdt.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzglu zzglu0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzglu0 = zzglu.zzf(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", zzgsc0);
            }
            if(zzglu0.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgdl zzgdl0 = new zzgdl(null);
            zzgdl0.zza(zzglu0.zza());
            zzgdl0.zzb(zzgdt.zzd(zzghd0.zzc().zzf()));
            return zzgdl0.zzc();
        }, zzgpo0, zzghd.class);
        zzgdt.zze = zzgft.zza(zzgdr.zza, zzgdg.class, zzghc.class);
        zzgdt.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                try {
                    zzglr zzglr0 = zzglr.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzglr0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgdl zzgdl0 = new zzgdl(null);
                    zzgdl0.zza(zzglr0.zzf().zzd());
                    zzgdl0.zzb(zzgdt.zzd(zzghc0.zzc()));
                    zzgdo zzgdo0 = zzgdl0.zzc();
                    zzgde zzgde0 = new zzgde(null);
                    zzgde0.zzc(zzgdo0);
                    zzgde0.zzb(zzgpp.zzb(zzglr0.zzf().zzA(), zzgas0));
                    zzgde0.zza(zzghc0.zzf());
                    return zzgde0.zzd();
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgdg zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgdo zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgdt.zzc);
        zzggi0.zzg(zzgdt.zzd);
        zzggi0.zzf(zzgdt.zze);
        zzggi0.zze(zzgdt.zzf);
    }

    private static zzgdm zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgdm.zza;
            }
            case 3: {
                return zzgdm.zzc;
            }
            case 2: 
            case 4: {
                return zzgdm.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

