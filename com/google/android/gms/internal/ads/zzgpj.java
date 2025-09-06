package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzgpj implements zzgkb {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    public zzgpj(String s, Key key0) {
        zzgpi zzgpi0 = new zzgpi(this);
        this.zza = zzgpi0;
        if(!zzgfj.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = s;
        this.zzc = key0;
        if(key0.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch(s) {
            case "HMACSHA1": {
                this.zzd = 20;
                break;
            }
            case "HMACSHA224": {
                this.zzd = 28;
                break;
            }
            case "HMACSHA256": {
                this.zzd = 0x20;
                break;
            }
            case "HMACSHA384": {
                this.zzd = 0x30;
                break;
            }
            case "HMACSHA512": {
                this.zzd = 0x40;
                break;
            }
            default: {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + s);
            }
        }
        zzgpi0.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzgkb
    public final byte[] zza(byte[] arr_b, int v) {
        if(v > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac)this.zza.get()).update(arr_b);
        return Arrays.copyOf(((Mac)this.zza.get()).doFinal(), v);
    }
}

