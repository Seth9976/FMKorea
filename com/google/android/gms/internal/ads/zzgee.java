package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzgee {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgee.zzb = zzgpo0;
        zzgee.zzc = zzggq.zzb(zzgea.zza, zzgdz.class, zzghd.class);
        zzgee.zzd = zzggm.zzb((zzghd zzghd0) -> {
            if(zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                try {
                    zzgma.zzd(zzghd0.zzc().zzg(), zzgrc.zza());
                    return zzgdz.zzb(zzgee.zzd(zzghd0.zzc().zzf()));
                }
                catch(zzgsc zzgsc0) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", zzgsc0);
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters: " + zzghd0.zzc().zzh());
        }, zzgpo0, zzghd.class);
        zzgee.zze = zzgft.zza(zzgec.zza, zzgdu.class, zzghc.class);
        zzgee.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                try {
                    zzglx zzglx0 = zzglx.zze(zzghc0.zze(), zzgrc.zza());
                    if(zzglx0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return zzgdu.zza(zzgee.zzd(zzghc0.zzc()), zzgpp.zzb(zzglx0.zzf().zzA(), zzgas0), zzghc0.zzf());
                }
                catch(zzgsc unused_ex) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgdu zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgdz zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgee.zzc);
        zzggi0.zzg(zzgee.zzd);
        zzggi0.zzf(zzgee.zze);
        zzggi0.zze(zzgee.zzf);
    }

    private static zzgdy zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgdy.zza;
            }
            case 3: {
                return zzgdy.zzc;
            }
            case 2: 
            case 4: {
                return zzgdy.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }
}

