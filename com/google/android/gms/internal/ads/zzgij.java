package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgij {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgij.zzb = zzgpo0;
        zzgij.zzc = zzggq.zzb(zzgif.zza, zzgie.class, zzghd.class);
        zzgij.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzgkh zzgkh0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzgkh0 = zzgkh.zze(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", zzgsc0);
            }
            zzgib zzgib0 = new zzgib(null);
            zzgib0.zza(zzgkh0.zza());
            zzgib0.zzb(zzgkh0.zzf().zza());
            zzgib0.zzc(zzgij.zzd(zzghd0.zzc().zzf()));
            return zzgib0.zzd();
        }, zzgpo0, zzghd.class);
        zzgij.zze = zzgft.zza(zzgih.zza, zzghu.class, zzghc.class);
        zzgij.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                try {
                    zzgke zzgke0 = zzgke.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzgke0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgib zzgib0 = new zzgib(null);
                    zzgib0.zza(zzgke0.zzg().zzd());
                    zzgib0.zzb(zzgke0.zzf().zza());
                    zzgib0.zzc(zzgij.zzd(zzghc0.zzc()));
                    zzgie zzgie0 = zzgib0.zzd();
                    zzghs zzghs0 = new zzghs(null);
                    zzghs0.zzc(zzgie0);
                    zzghs0.zza(zzgpp.zzb(zzgke0.zzg().zzA(), zzgas0));
                    zzghs0.zzb(zzghc0.zzf());
                    return zzghs0.zzd();
                }
                catch(zzgsc | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzghu zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgie zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgij.zzc);
        zzggi0.zzg(zzgij.zzd);
        zzggi0.zzf(zzgij.zze);
        zzggi0.zze(zzgij.zzf);
    }

    private static zzgic zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgic.zza;
            }
            case 2: {
                return zzgic.zzc;
            }
            case 3: {
                return zzgic.zzd;
            }
            case 4: {
                return zzgic.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

