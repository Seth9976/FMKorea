package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgcd {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgce zzd;

    private zzgcd() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    zzgcd(zzgcc zzgcc0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgce.zzc;
    }

    public final zzgcd zza(int v) {
        if(v != 12 && v != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", v));
        }
        this.zzb = v;
        return this;
    }

    public final zzgcd zzb(int v) {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgcd zzc(int v) {
        this.zzc = 16;
        return this;
    }

    public final zzgcd zzd(zzgce zzgce0) {
        this.zzd = zzgce0;
        return this;
    }

    public final zzgcg zze() {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int v = (int)this.zzb;
        this.zzc.intValue();
        return new zzgcg(((int)integer0), v, 16, this.zzd, null);
    }
}

