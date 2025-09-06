package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgip {
    private zzgjc zza;
    private zzgpp zzb;
    private Integer zzc;

    private zzgip() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    zzgip(zzgio zzgio0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public final zzgip zza(Integer integer0) {
        this.zzc = integer0;
        return this;
    }

    public final zzgip zzb(zzgpp zzgpp0) {
        this.zzb = zzgpp0;
        return this;
    }

    public final zzgip zzc(zzgjc zzgjc0) {
        this.zza = zzgjc0;
        return this;
    }

    public final zzgir zzd() {
        zzgpo zzgpo0;
        zzgjc zzgjc0 = this.zza;
        if(zzgjc0 != null) {
            zzgpp zzgpp0 = this.zzb;
            if(zzgpp0 != null) {
                if(zzgjc0.zzb() != zzgpp0.zza()) {
                    throw new GeneralSecurityException("Key size mismatch");
                }
                if(zzgjc0.zzg() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if(!this.zza.zzg() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if(this.zza.zzf() == zzgja.zzd) {
                    zzgpo0 = zzgpo.zzb(new byte[0]);
                    return new zzgir(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                if(this.zza.zzf() != zzgja.zzc && this.zza.zzf() != zzgja.zzb) {
                    if(this.zza.zzf() != zzgja.zza) {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.zza.zzf());
                    }
                    zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)this.zzc)).array());
                    return new zzgir(this.zza, this.zzb, zzgpo0, this.zzc, null);
                }
                zzgpo0 = zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)this.zzc)).array());
                return new zzgir(this.zza, this.zzb, zzgpo0, this.zzc, null);
            }
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
}

