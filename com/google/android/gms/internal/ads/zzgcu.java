package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgcu {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgcv zzd;

    private zzgcu() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    zzgcu(zzgct zzgct0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgcv.zzc;
    }

    public final zzgcu zza(int v) {
        this.zzb = 12;
        return this;
    }

    public final zzgcu zzb(int v) {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgcu zzc(int v) {
        this.zzc = 16;
        return this;
    }

    public final zzgcu zzd(zzgcv zzgcv0) {
        this.zzd = zzgcv0;
        return this;
    }

    public final zzgcx zze() {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgcx(((int)integer0), 12, 16, this.zzd, null);
    }
}

