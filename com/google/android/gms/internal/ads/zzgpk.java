package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzgpk implements zzgag {
    private static final byte[] zza;
    private final zzgkb zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static {
        zzgpk.zza = new byte[]{0};
    }

    private zzgpk(zzghu zzghu0) {
        this.zzb = new zzgph(zzghu0.zzd().zzc(zzfzo.zza()));
        this.zzc = zzghu0.zza().zza();
        this.zzd = zzghu0.zzc().zzc();
        if(zzghu0.zza().zzd().equals(zzgic.zzc)) {
            this.zze = Arrays.copyOf(zzgpk.zza, 1);
            return;
        }
        this.zze = new byte[0];
    }

    private zzgpk(zzgir zzgir0) {
        this.zzb = new zzgpj("HMAC" + zzgir0.zzd().zze(), new SecretKeySpec(zzgir0.zze().zzc(zzfzo.zza()), "HMAC"));
        this.zzc = zzgir0.zzd().zza();
        this.zzd = zzgir0.zzc().zzc();
        if(zzgir0.zzd().zzf().equals(zzgja.zzc)) {
            this.zze = Arrays.copyOf(zzgpk.zza, 1);
            return;
        }
        this.zze = new byte[0];
    }

    public zzgpk(zzgkb zzgkb0, int v) {
        this.zzb = zzgkb0;
        this.zzc = v;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if(v < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgkb0.zza(new byte[0], v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgag
    public final void zza(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b5;
        byte[] arr_b2 = this.zze;
        if(arr_b2.length > 0) {
            byte[] arr_b3 = zzgom.zzb(new byte[][]{arr_b1, arr_b2});
            byte[] arr_b4 = this.zzb.zza(arr_b3, this.zzc);
            arr_b5 = zzgom.zzb(new byte[][]{this.zzd, arr_b4});
        }
        else {
            byte[] arr_b6 = this.zzb.zza(arr_b1, this.zzc);
            arr_b5 = zzgom.zzb(new byte[][]{this.zzd, arr_b6});
        }
        if(!MessageDigest.isEqual(arr_b5, arr_b)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public static zzgag zzb(zzghu zzghu0) {
        return new zzgpk(zzghu0);
    }

    public static zzgag zzc(zzgir zzgir0) {
        return new zzgpk(zzgir0);
    }
}

