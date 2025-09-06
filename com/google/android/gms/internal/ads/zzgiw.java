package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgiw extends zzgfw {
    private static final zzggu zza;
    private static final zzggu zzb;

    static {
        zzgiw.zza = zzggu.zzb((zzfzp zzfzp0) -> new zzgjl(((zzgir)zzfzp0)), zzgir.class, zzgik.class);
        zzgiw.zzb = zzggu.zzb((zzgit this) -> zzgpk.zzc(((zzgir)zzfzp0)), zzgir.class, zzgag.class);
    }

    public zzgiw() {
        zzggv[] arr_zzggv = {new zzgiu(zzgag.class)};
        super(zzgmf.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgiv(this, zzgmi.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgmf.zzf(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgiw.zzm(((zzgmf)zzgta0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }

    static void zzg(zzgml zzgml0) {
        zzgiw.zzo(zzgml0);
    }

    public static void zzh(boolean z) {
        zzgar.zze(new zzgiw(), true);
        zzgjq.zzc(zzggi.zzc());
        zzggg.zza().zze(zzgiw.zza);
        zzggg.zza().zze(zzgiw.zzb);
    }

    public static final void zzm(zzgmf zzgmf0) {
        zzgpm.zzb(zzgmf0.zza(), 0);
        if(zzgmf0.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgiw.zzo(zzgmf0.zzg());
    }

    static zzgfu zzn(int v, int v1, int v2, int v3) {
        zzgmh zzgmh0 = zzgmi.zzd();
        zzgmk zzgmk0 = zzgml.zzc();
        zzgmk0.zzb(v2);
        zzgmk0.zza(v1);
        zzgmh0.zzb(((zzgml)zzgmk0.zzal()));
        zzgmh0.zza(v);
        return new zzgfu(((zzgmi)zzgmh0.zzal()), v3);
    }

    private static void zzo(zzgml zzgml0) {
        if(zzgml0.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch(zzgml0.zzg() - 2) {
            case 1: {
                if(zzgml0.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 2: {
                if(zzgml0.zza() > 0x30) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 3: {
                if(zzgml0.zza() > 0x20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 4: {
                if(zzgml0.zza() > 0x40) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 5: {
                if(zzgml0.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
    }
}

