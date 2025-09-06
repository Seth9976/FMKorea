package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgew {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgew.zzb = zzgpo0;
        zzgew.zzc = zzggq.zzb(zzges.zza, zzger.class, zzghd.class);
        zzgew.zzd = zzggm.zzb((zzghd zzghd0) -> {
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzgof zzgof0 = zzgof.zze(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", zzgsc0);
            }
            if(zzgof0.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return zzger.zzb(zzgew.zzd(zzghd0.zzc().zzf()));
        }, zzgpo0, zzghd.class);
        zzgew.zze = zzgft.zza(zzgeu.zza, zzgem.class, zzghc.class);
        zzgew.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                try {
                    zzgoc zzgoc0 = zzgoc.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzgoc0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return zzgem.zza(zzgew.zzd(zzghc0.zzc()), zzgpp.zzb(zzgoc0.zzf().zzA(), zzgas0), zzghc0.zzf());
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgem zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzger zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgew.zzc);
        zzggi0.zzg(zzgew.zzd);
        zzggi0.zzf(zzgew.zze);
        zzggi0.zze(zzgew.zzf);
    }

    private static zzgeq zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgeq.zza;
            }
            case 3: {
                return zzgeq.zzc;
            }
            case 2: 
            case 4: {
                return zzgeq.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

