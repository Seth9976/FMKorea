package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgib {
    private Integer zza;
    private Integer zzb;
    private zzgic zzc;

    private zzgib() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    zzgib(zzgia zzgia0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgic.zzd;
    }

    public final zzgib zza(int v) {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", ((int)(v * 8))));
        }
        this.zza = v;
        return this;
    }

    public final zzgib zzb(int v) {
        if(v < 10 || v > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + v);
        }
        this.zzb = v;
        return this;
    }

    public final zzgib zzc(zzgic zzgic0) {
        this.zzc = zzgic0;
        return this;
    }

    public final zzgie zzd() {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("variant not set");
        }
        return new zzgie(((int)integer0), ((int)this.zzb), this.zzc, null);
    }
}

