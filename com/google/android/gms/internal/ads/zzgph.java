package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzgph implements zzgkb {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgph(byte[] arr_b) {
        zzgpm.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.zza = secretKeySpec0;
        Cipher cipher0 = zzgph.zzb();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = zzgjj.zza(cipher0.doFinal(new byte[16]));
        this.zzb = arr_b1;
        this.zzc = zzgjj.zza(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgkb
    public final byte[] zza(byte[] arr_b, int v) {
        byte[] arr_b1;
        if(v > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher0 = zzgph.zzb();
        cipher0.init(1, this.zza);
        int v1 = Math.max(1, ((int)Math.ceil(((double)arr_b.length) / 16.0)));
        if(v1 * 16 == arr_b.length) {
            arr_b1 = zzgom.zzd(arr_b, (v1 - 1) * 16, this.zzb, 0, 16);
        }
        else {
            byte[] arr_b2 = Arrays.copyOfRange(arr_b, (v1 - 1) * 16, arr_b.length);
            if(arr_b2.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] arr_b3 = Arrays.copyOf(arr_b2, 16);
            arr_b3[arr_b2.length] = (byte)0x80;
            arr_b1 = zzgom.zzc(arr_b3, this.zzc);
        }
        byte[] arr_b4 = new byte[16];
        for(int v2 = 0; v2 < v1 - 1; ++v2) {
            arr_b4 = cipher0.doFinal(zzgom.zzd(arr_b4, 0, arr_b, v2 * 16, 16));
        }
        return Arrays.copyOf(cipher0.doFinal(zzgom.zzc(arr_b1, arr_b4)), v);
    }

    private static Cipher zzb() {
        if(!zzgfj.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        return (Cipher)zzgow.zza.zza("AES/ECB/NoPadding");
    }
}

