package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgfi implements zzfzi {
    private static final ThreadLocal zza;
    private static final boolean zzb;
    private final SecretKey zzc;

    static {
        boolean z;
        zzgfi.zza = new zzgfh();
        try {
            z = false;
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z = true;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        zzgfi.zzb = z;
    }

    public zzgfi(byte[] arr_b) {
        zzgpm.zza(arr_b.length);
        this.zzc = new SecretKeySpec(arr_b, "AES");
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        GCMParameterSpec gCMParameterSpec0;
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(zzgfi.zzb) {
            gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b, 0, 12);
        }
        else if(zzgpl.zza()) {
            gCMParameterSpec0 = new IvParameterSpec(arr_b, 0, 12);
        }
        else {
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
        ThreadLocal threadLocal0 = zzgfi.zza;
        ((Cipher)threadLocal0.get()).init(2, this.zzc, gCMParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b1);
        }
        return ((Cipher)threadLocal0.get()).doFinal(arr_b, 12, arr_b.length - 12);
    }
}

