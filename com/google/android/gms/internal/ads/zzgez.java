package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgez {
    private static final ThreadLocal zza;
    private final SecretKey zzb;

    static {
        zzgez.zza = new zzgey();
    }

    public zzgez(byte[] arr_b, boolean z) {
        if(!zzgfj.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgpm.zza(arr_b.length);
        this.zzb = new SecretKeySpec(arr_b, "AES");
    }

    public final byte[] zza(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        if(arr_b.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if(arr_b1.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!ByteBuffer.wrap(arr_b).equals(ByteBuffer.wrap(arr_b1, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        Integer integer0 = Build.VERSION.SDK_INT;
        GCMParameterSpec gCMParameterSpec0 = integer0 == null || ((int)integer0) > 19 ? new GCMParameterSpec(0x80, arr_b, 0, 12) : new IvParameterSpec(arr_b, 0, 12);
        ThreadLocal threadLocal0 = zzgez.zza;
        ((Cipher)threadLocal0.get()).init(2, this.zzb, gCMParameterSpec0);
        if(arr_b2 != null && arr_b2.length != 0) {
            ((Cipher)threadLocal0.get()).updateAAD(arr_b2);
        }
        return ((Cipher)threadLocal0.get()).doFinal(arr_b1, 12, arr_b1.length - 12);
    }
}

