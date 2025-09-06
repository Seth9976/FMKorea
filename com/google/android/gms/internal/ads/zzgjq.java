package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjq {
    public static final int zza;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpo0 = zzghq.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgjq.zzb = zzgpo0;
        zzgjq.zzc = zzggq.zzb(zzgjm.zza, zzgjc.class, zzghd.class);
        zzgjq.zzd = zzggm.zzb((zzghd zzghd0) -> {
            zzgmi zzgmi0;
            if(!zzghd0.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzghd0.zzc().zzh());
            }
            try {
                zzgmi0 = zzgmi.zzg(zzghd0.zzc().zzg(), zzgrc.zza());
            }
            catch(zzgsc zzgsc0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", zzgsc0);
            }
            if(zzgmi0.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzgmi0.zzc());
            }
            zzgiy zzgiy0 = zzgjc.zzd();
            zzgiy0.zzb(zzgmi0.zza());
            zzgiy0.zzc(zzgmi0.zzh().zza());
            zzgiy0.zza(zzgjq.zze(zzgmi0.zzh().zzg()));
            zzgiy0.zzd(zzgjq.zzd(zzghd0.zzc().zzf()));
            return zzgiy0.zze();
        }, zzgpo0, zzghd.class);
        zzgjq.zze = zzgft.zza(zzgjo.zza, zzgir.class, zzghc.class);
        zzgjq.zzf = zzgfp.zzb((zzghc zzghc0, zzgas zzgas0) -> {
            if(zzghc0.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                try {
                    zzgmf zzgmf0 = zzgmf.zzf(zzghc0.zze(), zzgrc.zza());
                    if(zzgmf0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgiy zzgiy0 = zzgjc.zzd();
                    zzgiy0.zzb(zzgmf0.zzh().zzd());
                    zzgiy0.zzc(zzgmf0.zzg().zza());
                    zzgiy0.zza(zzgjq.zze(zzgmf0.zzg().zzg()));
                    zzgiy0.zzd(zzgjq.zzd(zzghc0.zzc()));
                    zzgjc zzgjc0 = zzgiy0.zze();
                    zzgip zzgip0 = zzgir.zza();
                    zzgip0.zzc(zzgjc0);
                    zzgip0.zzb(zzgpp.zzb(zzgmf0.zzh().zzA(), zzgas0));
                    zzgip0.zza(zzghc0.zzf());
                    return zzgip0.zzd();
                }
                catch(zzgsc | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }, zzgpo0, zzghc.class);
    }

    // 检测为 Lambda 实现
    public static zzgir zza(zzghc zzghc0, zzgas zzgas0) [...]

    // 检测为 Lambda 实现
    public static zzgjc zzb(zzghd zzghd0) [...]

    public static void zzc(zzggi zzggi0) {
        zzggi0.zzh(zzgjq.zzc);
        zzggi0.zzg(zzgjq.zzd);
        zzggi0.zzf(zzgjq.zze);
        zzggi0.zze(zzgjq.zzf);
    }

    private static zzgja zzd(zzgnw zzgnw0) {
        switch(zzgnw0.ordinal()) {
            case 1: {
                return zzgja.zza;
            }
            case 2: {
                return zzgja.zzc;
            }
            case 3: {
                return zzgja.zzd;
            }
            case 4: {
                return zzgja.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnw0.zza());
            }
        }
    }

    private static zzgiz zze(int v) {
        switch(v - 2) {
            case 1: {
                return zzgiz.zza;
            }
            case 2: {
                return zzgiz.zzd;
            }
            case 3: {
                return zzgiz.zzc;
            }
            case 4: {
                return zzgiz.zze;
            }
            case 5: {
                return zzgiz.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(v));
            }
        }
    }
}

