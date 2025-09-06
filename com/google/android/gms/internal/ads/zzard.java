package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzard {
    private static Cipher zza;
    private static final Object zzb;
    private static final Object zzc;

    static {
        zzard.zzb = new Object();
        zzard.zzc = new Object();
    }

    public zzard(SecureRandom secureRandom0) {
    }

    public final String zza(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b3;
        byte[] arr_b2;
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzard.zzb) {
                zzard.zzc().init(1, secretKeySpec0, null);
                arr_b2 = zzard.zzc().doFinal(arr_b1);
                arr_b3 = zzard.zzc().getIV();
            }
            int v1 = arr_b2.length + arr_b3.length;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
            byteBuffer0.put(arr_b3).put(arr_b2);
            byteBuffer0.flip();
            byte[] arr_b4 = new byte[v1];
            byteBuffer0.get(arr_b4);
            return zzapi.zza(arr_b4, false);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new zzarc(this, noSuchAlgorithmException0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzarc(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzarc(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzarc(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzarc(this, badPaddingException0);
        }
    }

    public final byte[] zzb(byte[] arr_b, String s) {
        try {
            byte[] arr_b1 = zzapi.zzb(s, false);
            if(arr_b1.length <= 16) {
                throw new zzarc(this);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length);
            byteBuffer0.put(arr_b1);
            byteBuffer0.flip();
            byte[] arr_b2 = new byte[16];
            byte[] arr_b3 = new byte[arr_b1.length - 16];
            byteBuffer0.get(arr_b2);
            byteBuffer0.get(arr_b3);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzard.zzb) {
                zzard.zzc().init(2, secretKeySpec0, new IvParameterSpec(arr_b2));
            }
            return zzard.zzc().doFinal(arr_b3);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzarc(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzarc(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzarc(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzarc(this, badPaddingException0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new zzarc(this, invalidAlgorithmParameterException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new zzarc(this, illegalArgumentException0);
        }
        throw new zzarc(this, noSuchAlgorithmException0);
    }

    private static final Cipher zzc() {
        synchronized(zzard.zzc) {
            if(zzard.zza == null) {
                zzard.zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            return zzard.zza;
        }
    }
}

