package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgbb {
    private zzgbm zza;
    private zzgpp zzb;
    private zzgpp zzc;
    private Integer zzd;

    private zzgbb() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    zzgbb(zzgba zzgba0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final zzgbb zza(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzgbb zzb(zzgpp zzgpp0) {
        this.zzc = zzgpp0;
        return this;
    }

    public final zzgbb zzc(Integer integer0) {
        this.zzd = integer0;
        return this;
    }

    public final zzgbb zzd(zzgbm zzgbm0) {
        this.zza = zzgbm0;
        return this;
    }

    public final zzgbd zze() {
        zzgpo zzgpo0;
        zzgbm zzgbm0 = this.zza;
        if(zzgbm0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgpp zzgpp0 = this.zzb;
        if(zzgpp0 == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if(zzgbm0.zza() != zzgpp0.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if(zzgbm0.zzb() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if(this.zza.zzg() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if(!this.zza.zzg() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if(this.zza.zzf() == zzgbk.zzc) {
            zzgpo0 = zzgpo.zzb(new byte[0]);
            return new zzgbd(this.zza, this.zzb, this.zzc, zzgpo0, this.zzd, null);
        }
        if(this.zza.zzf() == zzgbk.zzb) {
            zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzd)).array());
            return new zzgbd(this.zza, this.zzb, this.zzc, zzgpo0, this.zzd, null);
        }
        if(this.zza.zzf() != zzgbk.zza) {
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.zza.zzf());
        }
        zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzd)).array());
        return new zzgbd(this.zza, this.zzb, this.zzc, zzgpo0, this.zzd, null);
    }
}

