package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgdl {
    private Integer zza;
    private zzgdm zzb;

    private zzgdl() {
        this.zza = null;
        throw null;
    }

    zzgdl(zzgdk zzgdk0) {
        this.zza = null;
        this.zzb = zzgdm.zzc;
    }

    public final zzgdl zza(int v) {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgdl zzb(zzgdm zzgdm0) {
        this.zzb = zzgdm0;
        return this;
    }

    public final zzgdo zzc() {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        return new zzgdo(((int)integer0), this.zzb, null);
    }
}

