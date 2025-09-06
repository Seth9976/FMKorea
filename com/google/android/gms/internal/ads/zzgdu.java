package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgdu extends zzgav {
    private final zzgdz zza;
    private final zzgpp zzb;
    private final zzgpo zzc;
    private final Integer zzd;

    private zzgdu(zzgdz zzgdz0, zzgpp zzgpp0, zzgpo zzgpo0, Integer integer0) {
        this.zza = zzgdz0;
        this.zzb = zzgpp0;
        this.zzc = zzgpo0;
        this.zzd = integer0;
    }

    public static zzgdu zza(zzgdy zzgdy0, zzgpp zzgpp0, Integer integer0) {
        zzgdy zzgdy1 = zzgdy.zzc;
        if(zzgdy0 != zzgdy1 && integer0 == null) {
            throw new GeneralSecurityException("For given Variant " + zzgdy0.toString() + " the value of idRequirement must be non-null");
        }
        if(zzgdy0 == zzgdy1 && integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if(zzgpp0.zza() != 0x20) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgpp0.zza());
        }
        zzgdz zzgdz0 = zzgdz.zzb(zzgdy0);
        if(zzgdz0.zza() == zzgdy1) {
            return new zzgdu(zzgdz0, zzgpp0, zzgpo.zzb(new byte[0]), integer0);
        }
        if(zzgdz0.zza() == zzgdy.zzb) {
            return new zzgdu(zzgdz0, zzgpp0, zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)integer0)).array()), integer0);
        }
        if(zzgdz0.zza() != zzgdy.zza) {
            throw new IllegalStateException("Unknown Variant: " + zzgdz0.zza().toString());
        }
        return new zzgdu(zzgdz0, zzgpp0, zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)integer0)).array()), integer0);
    }
}

