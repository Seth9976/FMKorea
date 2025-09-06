package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgiy {
    private Integer zza;
    private Integer zzb;
    private zzgiz zzc;
    private zzgja zzd;

    private zzgiy() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    zzgiy(zzgix zzgix0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgja.zzd;
    }

    public final zzgiy zza(zzgiz zzgiz0) {
        this.zzc = zzgiz0;
        return this;
    }

    public final zzgiy zzb(int v) {
        this.zza = v;
        return this;
    }

    public final zzgiy zzc(int v) {
        this.zzb = v;
        return this;
    }

    public final zzgiy zzd(zzgja zzgja0) {
        this.zzd = zzgja0;
        return this;
    }

    public final zzgjc zze() {
        Integer integer0 = this.zza;
        if(integer0 == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if(this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if(((int)integer0) < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        Integer integer1 = this.zzb;
        int v = (int)integer1;
        zzgiz zzgiz0 = this.zzc;
        if(v < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", integer1));
        }
        if(zzgiz0 != zzgiz.zza) {
            if(zzgiz0 == zzgiz.zzb) {
                if(v > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", integer1));
                }
                return new zzgjc(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgiz0 == zzgiz.zzc) {
                if(v > 0x20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", integer1));
                }
                return new zzgjc(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgiz0 == zzgiz.zzd) {
                if(v > 0x30) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", integer1));
                }
                return new zzgjc(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
            }
            if(zzgiz0 != zzgiz.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if(v > 0x40) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", integer1));
            }
        }
        else if(v > 20) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", integer1));
        }
        return new zzgjc(((int)this.zza), ((int)this.zzb), this.zzd, this.zzc, null);
    }
}

