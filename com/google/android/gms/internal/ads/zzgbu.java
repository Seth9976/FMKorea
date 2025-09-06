package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgbu extends zzgfw {
    zzgbu() {
        zzggv[] arr_zzggv = {new zzgbs(zzgpg.class)};
        super(zzgkt.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgbt(this, zzgkw.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzgkt.zzf(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgbu.zzh(((zzgkt)zzgta0));
    }

    static void zzg(zzgbu zzgbu0, zzgkz zzgkz0) {
        zzgbu.zzm(zzgkz0);
    }

    public static final void zzh(zzgkt zzgkt0) {
        zzgpm.zzb(zzgkt0.zza(), 0);
        zzgpm.zza(zzgkt0.zzh().zzd());
        zzgbu.zzm(zzgkt0.zzg());
    }

    private static final void zzm(zzgkz zzgkz0) {
        if(zzgkz0.zza() < 12 || zzgkz0.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}

