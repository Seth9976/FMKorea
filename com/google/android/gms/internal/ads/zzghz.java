package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghz extends zzgfw {
    private static final zzggu zza;
    private static final zzggu zzb;

    static {
        zzghz.zza = zzggu.zzb((zzfzp zzfzp0) -> new zzgjk(((zzghu)zzfzp0)), zzghu.class, zzgik.class);
        zzghz.zzb = zzggu.zzb((zzghw this) -> zzgpk.zzb(((zzghu)zzfzp0)), zzghu.class, zzgag.class);
    }

    zzghz() {
        zzggv[] arr_zzggv = {new zzghx(zzgag.class)};
        super(zzgke.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzghy(this, zzgkh.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgke.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzgke)zzgta0).zza(), 0);
        zzghz.zzo(((zzgke)zzgta0).zzg().zzd());
        zzghz.zzn(((zzgke)zzgta0).zzf());
    }

    public static void zzm(boolean z) {
        zzgar.zze(new zzghz(), true);
        zzgij.zzc(zzggi.zzc());
        zzggg.zza().zze(zzghz.zza);
        zzggg.zza().zze(zzghz.zzb);
    }

    private static void zzn(zzgkk zzgkk0) {
        if(zzgkk0.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if(zzgkk0.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    private static void zzo(int v) {
        if(v != 0x20) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

