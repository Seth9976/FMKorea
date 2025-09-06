package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgbw {
    private zzgcg zza;
    private zzgpp zzb;
    private Integer zzc;

    private zzgbw() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgbw(zzgbv zzgbv0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgbw zza(Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgbw zzb(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzgbw zzc(zzgcg zzgcg0) {
        this.zza = zzgcg0;
        return this;
    }

    public final zzgby zzd() {
        zzgpo zzgpo0;
        zzgcg zzgcg0 = this.zza;
        if(zzgcg0 != null) {
            zzgpp zzgpp0 = this.zzb;
            if(zzgpp0 != null) {
                if(zzgcg0.zzb() != zzgpp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgcg0.zzd() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zzd() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzc() == zzgce.zzc) {
                    zzgpo0 = zzgpo.zzb(new byte[0]);
                    return new zzgby(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzc() == zzgce.zzb) {
                    zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzc)).array());
                    return new zzgby(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzc() != zzgce.zza) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.zza.zzc());
                }
                zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzc)).array());
                return new zzgby(this.zza, this.zzb, zzgpo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

