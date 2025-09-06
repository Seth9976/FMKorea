package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgcn {
    private zzgcx zza;
    private zzgpp zzb;
    private Integer zzc;

    private zzgcn() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgcn(zzgcm zzgcm0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgcn zza(Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgcn zzb(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzgcn zzc(zzgcx zzgcx0) {
        this.zza = zzgcx0;
        return this;
    }

    public final zzgcp zzd() {
        zzgpo zzgpo0;
        zzgcx zzgcx0 = this.zza;
        if(zzgcx0 != null) {
            zzgpp zzgpp0 = this.zzb;
            if(zzgpp0 != null) {
                if(zzgcx0.zza() != zzgpp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgcx0.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzb() == zzgcv.zzc) {
                    zzgpo0 = zzgpo.zzb(new byte[0]);
                    return new zzgcp(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzb() == zzgcv.zzb) {
                    zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzc)).array());
                    return new zzgcp(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzb() != zzgcv.zza) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.zza.zzb());
                }
                zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzc)).array());
                return new zzgcp(this.zza, this.zzb, zzgpo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

