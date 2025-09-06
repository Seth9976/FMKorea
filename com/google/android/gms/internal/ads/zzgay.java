package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

final class zzgay implements zzfzi {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    zzgay(zzgao zzgao0, zzgax zzgax0) {
        zzgju zzgju0;
        this.zza = zzgao0;
        if(zzgao0.zzf()) {
            zzgjv zzgjv0 = zzggf.zza().zzb();
            zzgka zzgka0 = zzggc.zza(zzgao0);
            this.zzb = zzgjv0.zza(zzgka0, "aead", "encrypt");
            zzgju0 = zzgjv0.zza(zzgka0, "aead", "decrypt");
        }
        else {
            zzgju0 = zzggc.zza;
            this.zzb = zzgju0;
        }
        this.zzc = zzgju0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length > 5) {
            byte[] arr_b2 = Arrays.copyOf(arr_b, 5);
            byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
            for(Object object0: this.zza.zze(arr_b2)) {
                zzgak zzgak0 = (zzgak)object0;
                try {
                    return ((zzfzi)zzgak0.zze()).zza(arr_b3, arr_b1);
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    zzgaz.zzd().logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: " + generalSecurityException0.toString());
                }
            }
        }
        Iterator iterator1 = this.zza.zze(zzfzn.zza).iterator();
    label_12:
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            zzgak zzgak1 = (zzgak)object1;
            try {
                return ((zzfzi)zzgak1.zze()).zza(arr_b, arr_b1);
            }
            catch(GeneralSecurityException unused_ex) {
                goto label_12;
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

