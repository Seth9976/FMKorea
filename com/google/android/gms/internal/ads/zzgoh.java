package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgoh implements zzgpg {
    private static final ThreadLocal zza;
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzgoh.zza = new zzgog();
    }

    public zzgoh(byte[] arr_b, int v) {
        if(!zzgfj.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgpm.zza(arr_b.length);
        this.zzb = new SecretKeySpec(arr_b, "AES");
        int v1 = ((Cipher)zzgoh.zza.get()).getBlockSize();
        this.zzd = v1;
        if(v < 12 || v > v1) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgpg
    public final byte[] zza(byte[] arr_b) {
        int v = this.zzc;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
        int v1 = arr_b.length - this.zzc;
        byte[] arr_b2 = new byte[v1];
        Cipher cipher0 = (Cipher)zzgoh.zza.get();
        byte[] arr_b3 = new byte[this.zzd];
        System.arraycopy(arr_b1, 0, arr_b3, 0, this.zzc);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b3);
        cipher0.init(2, this.zzb, ivParameterSpec0);
        if(cipher0.doFinal(arr_b, this.zzc, v1, arr_b2, 0) != v1) {
            throw new GeneralSecurityException("stored output\'s length does not match input\'s length");
        }
        return arr_b2;
    }
}

