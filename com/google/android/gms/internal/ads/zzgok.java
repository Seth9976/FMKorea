package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgok implements zzfzi {
    private static final ThreadLocal zza;
    private static final ThreadLocal zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    static {
        zzgok.zza = new zzgoi();
        zzgok.zzb = new zzgoj();
    }

    public zzgok(byte[] arr_b, int v) {
        if(!zzgfj.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if(v != 12 && v != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = v;
        zzgpm.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.zze = secretKeySpec0;
        Cipher cipher0 = (Cipher)zzgok.zza.get();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b1 = zzgok.zzb(cipher0.doFinal(new byte[16]));
        this.zzc = arr_b1;
        this.zzd = zzgok.zzb(arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) {
        int v = arr_b.length - this.zzf - 16;
        if(v < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Object object0 = zzgok.zza.get();
        ((Cipher)object0).init(1, this.zze);
        byte[] arr_b2 = this.zzc(((Cipher)object0), 0, arr_b, 0, this.zzf);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b3 = this.zzc(((Cipher)object0), 1, arr_b1, 0, arr_b1.length);
        byte[] arr_b4 = this.zzc(((Cipher)object0), 2, arr_b, this.zzf, v);
        int v2 = arr_b.length - 16;
        int v3 = 0;
        for(int v1 = 0; v1 < 16; ++v1) {
            v3 = (byte)(v3 | arr_b[v2 + v1] ^ arr_b3[v1] ^ arr_b2[v1] ^ arr_b4[v1]);
        }
        if(v3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher0 = (Cipher)zzgok.zzb.get();
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b2);
        cipher0.init(1, this.zze, ivParameterSpec0);
        return cipher0.doFinal(arr_b, this.zzf, v);
    }

    private static byte[] zzb(byte[] arr_b) {
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 15; ++v) {
            int v1 = arr_b[v];
            arr_b1[v] = (byte)((v1 + v1 ^ (arr_b[v + 1] & 0xFF) >>> 7) & 0xFF);
        }
        int v2 = arr_b[15];
        arr_b1[15] = (byte)(arr_b[0] >> 7 & 0x87 ^ v2 + v2);
        return arr_b1;
    }

    private final byte[] zzc(Cipher cipher0, int v, byte[] arr_b, int v1, int v2) {
        byte[] arr_b1 = new byte[16];
        arr_b1[15] = (byte)v;
        if(v2 == 0) {
            return cipher0.doFinal(zzgok.zzd(arr_b1, this.zzc));
        }
        byte[] arr_b2 = cipher0.doFinal(arr_b1);
        int v4;
        for(v4 = 0; v2 - v4 > 16; v4 += 16) {
            for(int v5 = 0; v5 < 16; ++v5) {
                arr_b2[v5] = (byte)(arr_b2[v5] ^ arr_b[v1 + v4 + v5]);
            }
            arr_b2 = cipher0.doFinal(arr_b2);
        }
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, v4 + v1, v1 + v2);
        if(arr_b3.length == 16) {
            return cipher0.doFinal(zzgok.zzd(arr_b2, zzgok.zzd(arr_b3, this.zzc)));
        }
        byte[] arr_b4 = Arrays.copyOf(this.zzd, 16);
        for(int v3 = 0; v3 < arr_b3.length; ++v3) {
            arr_b4[v3] = (byte)(arr_b4[v3] ^ arr_b3[v3]);
        }
        arr_b4[arr_b3.length] = (byte)(arr_b4[arr_b3.length] ^ 0x80);
        return cipher0.doFinal(zzgok.zzd(arr_b2, arr_b4));
    }

    private static byte[] zzd(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = new byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b2[v] = (byte)(arr_b[v] ^ arr_b1[v]);
        }
        return arr_b2;
    }
}

