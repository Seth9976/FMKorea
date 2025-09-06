package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzgbi {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Integer zzd;
    private zzgbj zze;
    private zzgbk zzf;

    private zzgbi() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        throw null;
    }

    zzgbi(zzgbh zzgbh0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = zzgbk.zzc;
    }

    public final zzgbi zza(int v) {
        if(v != 16 && v != 24 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", v));
        }
        this.zza = v;
        return this;
    }

    public final zzgbi zzb(zzgbj zzgbj0) {
        this.zze = zzgbj0;
        return this;
    }

    public final zzgbi zzc(int v) {
        if(v < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", v));
        }
        this.zzb = v;
        return this;
    }

    public final zzgbi zzd(int v) {
        if(v < 12 || v > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", v));
        }
        this.zzc = v;
        return this;
    }

    public final zzgbi zze(int v) {
        if(v < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", v));
        }
        this.zzd = v;
        return this;
    }

    public final zzgbi zzf(zzgbk zzgbk0) {
        this.zzf = zzgbk0;
        return this;
    }

    public final zzgbm zzg() {
        if(this.zza == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if(this.zzc == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer integer0 = this.zzd;
        if(integer0 == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if(this.zze == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if(this.zzf == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int v = (int)integer0;
        zzgbj zzgbj0 = this.zze;
        if(zzgbj0 != zzgbj.zza) {
            if(zzgbj0 == zzgbj.zzb) {
                if(v > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", integer0));
                }
                return new zzgbm(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgbj0 == zzgbj.zzc) {
                if(v > 0x20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", integer0));
                }
                return new zzgbm(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgbj0 == zzgbj.zzd) {
                if(v > 0x30) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", integer0));
                }
                return new zzgbm(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
            }
            if(zzgbj0 != zzgbj.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if(v > 0x40) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", integer0));
            }
        }
        else if(v > 20) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", integer0));
        }
        return new zzgbm(((int)this.zza), ((int)this.zzb), ((int)this.zzc), ((int)this.zzd), this.zzf, this.zze, null);
    }
}

