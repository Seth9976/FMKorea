package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzghs {
    private zzgie zza;
    private zzgpp zzb;
    private Integer zzc;

    private zzghs() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzghs(zzghr zzghr0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzghs zza(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzghs zzb(Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzghs zzc(zzgie zzgie0) {
        this.zza = zzgie0;
        return this;
    }

    public final zzghu zzd() {
        zzgpo zzgpo0;
        zzgie zzgie0 = this.zza;
        if(zzgie0 != null) {
            zzgpp zzgpp0 = this.zzb;
            if(zzgpp0 != null) {
                if(zzgie0.zzb() != zzgpp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgie0.zze() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zze() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzd() == zzgic.zzd) {
                    zzgpo0 = zzgpo.zzb(new byte[0]);
                    return new zzghu(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzd() != zzgic.zzc && this.zza.zzd() != zzgic.zzb) {
                    if(this.zza.zzd() != zzgic.zza) {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.zza.zzd());
                    }
                    zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzc)).array());
                    return new zzghu(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzc)).array());
                return new zzghu(this.zza, this.zzb, zzgpo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

