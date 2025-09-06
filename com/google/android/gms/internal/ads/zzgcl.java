package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgcl {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgcl.zzb = zzgpo0;
        zzgcl.zzc = zzggq.zzb(zzgch.zza, zzgcg.class, zzghd.class);
        zzgcl.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzglf zzglf0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzglf0 = zzglf.zze(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", zzgsc0);
            }
            zzgcd zzgcd0 = new zzgcd(null);
            zzgcd0.zzb(zzglf0.zza());
            zzgcd0.zza(zzglf0.zzf().zza());
            zzgcd0.zzc(16);
            zzgcd0.zzd(zzgcl.zzd(zzghd0.zzc().zzf()));
            return zzgcd0.zze();
        }, zzgpo0, zzghd.class);
        zzgcl.zze = zzgft.zza(zzgcj.zza, zzgby.class, zzghc.class);
        zzgcl.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                try {
                    zzglc zzglc0 = zzglc.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzglc0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgcd zzgcd0 = new zzgcd(null);
                    zzgcd0.zzb(zzglc0.zzg().zzd());
                    zzgcd0.zza(zzglc0.zzf().zza());
                    zzgcd0.zzc(16);
                    zzgcd0.zzd(zzgcl.zzd(zzghc0.zzc()));
                    zzgcg zzgcg0 = zzgcd0.zze();
                    zzgbw zzgbw0 = new zzgbw(null);
                    zzgbw0.zzc(zzgcg0);
                    zzgbw0.zzb(zzgpp.zzb(zzglc0.zzg().zzA(), zzgas0));
                    zzgbw0.zza(zzghc0.zzf());
                    return zzgbw0.zzd();
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgby zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgcg zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgcl.zzc);
        zzggi0.zzg(zzgcl.zzd);
        zzggi0.zzf(zzgcl.zze);
        zzggi0.zze(zzgcl.zzf);
    }

    private static zzgce zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgce.zza;
            }
            case 3: {
                return zzgce.zzc;
            }
            case 2: 
            case 4: {
                return zzgce.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

