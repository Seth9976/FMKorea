package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzgei implements zzfzi {
    private static final byte[] zza;
    private static final Set zzb;
    private final zzgmv zzc;
    private final zzfzi zzd;

    static {
        zzgei.zza = new byte[0];
        HashSet hashSet0 = new HashSet();
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet0.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgei.zzb = Collections.unmodifiableSet(hashSet0);
    }

    public zzgei(zzgmv zzgmv0, zzfzi zzfzi0) {
        if(!zzgei.zzb(zzgmv0.zzh())) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzgmv0.zzh() + ". Only Tink AEAD key types are supported.");
        }
        this.zzc = zzgmv0;
        this.zzd = zzfzi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            int v = byteBuffer0.getInt();
            if(v <= 0 || v > arr_b.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] arr_b2 = new byte[v];
            byteBuffer0.get(arr_b2, 0, v);
            byte[] arr_b3 = new byte[byteBuffer0.remaining()];
            byteBuffer0.get(arr_b3, 0, byteBuffer0.remaining());
            byte[] arr_b4 = this.zzd.zza(arr_b2, zzgei.zza);
            zzgqi zzgqi0 = zzgqi.zzv(arr_b4, 0, arr_b4.length);
            return ((zzfzi)zzgar.zzc(this.zzc.zzh(), zzgqi0, zzfzi.class)).zza(arr_b3, arr_b1);
        }
        catch(IndexOutOfBoundsException | BufferUnderflowException | NegativeArraySizeException indexOutOfBoundsException0) {
        }
        throw new GeneralSecurityException("invalid ciphertext", indexOutOfBoundsException0);
    }

    public static boolean zzb(String s) {
        return zzgei.zzb.contains(s);
    }
}

