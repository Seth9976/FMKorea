package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgde {
    private zzgdo zza;
    private zzgpp zzb;
    private Integer zzc;

    private zzgde() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgde(zzgdd zzgdd0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgde zza(Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgde zzb(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzgde zzc(zzgdo zzgdo0) {
        this.zza = zzgdo0;
        return this;
    }

    public final zzgdg zzd() {
        zzgpo zzgpo0;
        zzgdo zzgdo0 = this.zza;
        if(zzgdo0 != null) {
            zzgpp zzgpp0 = this.zzb;
            if(zzgpp0 != null) {
                if(zzgdo0.zza() != zzgpp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgdo0.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzb() == zzgdm.zzc) {
                    zzgpo0 = zzgpo.zzb(new byte[0]);
                    return new zzgdg(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzb() == zzgdm.zzb) {
                    zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzc)).array());
                    return new zzgdg(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzb() != zzgdm.zza) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.zza.zzb());
                }
                zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzc)).array());
                return new zzgdg(this.zza, this.zzb, zzgpo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

