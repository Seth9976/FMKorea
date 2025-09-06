package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzgdj extends zzgfw {
    zzgdj() {
        zzggv[] arr_zzggv = {new zzgdh(zzfzi.class)};
        super(zzglr.class, arr_zzggv);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgdi(this, zzglu.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final zzgta zzc(zzgqi zzgqi0) {
        return zzglr.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgfw
    public final void zze(zzgta zzgta0) {
        zzgpm.zzb(((zzglr)zzgta0).zza(), 0);
        zzgpm.zza(((zzglr)zzgta0).zzf().zzd());
    }

    public static void zzg(boolean z) {
        if(zzgdj.zzm()) {
            zzgar.zze(new zzgdj(), true);
            zzgdt.zzc(zzggi.zzc());
        }
    }

    static zzgfu zzh(int v, int v1) {
        zzglt zzglt0 = zzglu.zzd();
        zzglt0.zza(v);
        return new zzgfu(((zzglu)zzglt0.zzal()), v1);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
            return false;
        }
    }
}

