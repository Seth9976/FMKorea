package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzgem extends zzgav {
    private final zzger zza;
    private final zzgpp zzb;
    private final zzgpo zzc;
    private final Integer zzd;

    private zzgem(zzger zzger0, zzgpp zzgpp0, zzgpo zzgpo0, Integer integer0) {
        this.zza = zzger0;
        this.zzb = zzgpp0;
        this.zzc = zzgpo0;
        this.zzd = integer0;
    }

    public static zzgem zza(zzgeq zzgeq0, zzgpp zzgpp0, Integer integer0) {
        zzgeq zzgeq1 = zzgeq.zzc;
        if(zzgeq0 != zzgeq1 && integer0 == null) {
            throw new GeneralSecurityException("For given Variant " + zzgeq0.toString() + " the value of idRequirement must be non-null");
        }
        if(zzgeq0 == zzgeq1 && integer0 != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if(zzgpp0.zza() != 0x20) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgpp0.zza());
        }
        zzger zzger0 = zzger.zzb(zzgeq0);
        if(zzger0.zza() == zzgeq1) {
            return new zzgem(zzger0, zzgpp0, zzgpo.zzb(new byte[0]), integer0);
        }
        if(zzger0.zza() == zzgeq.zzb) {
            return new zzgem(zzger0, zzgpp0, zzgpo.zzb(ByteBuffer.allocate(5).put(0).putInt(((int)integer0)).array()), integer0);
        }
        if(zzger0.zza() != zzgeq.zza) {
            throw new IllegalStateException("Unknown Variant: " + zzger0.zza().toString());
        }
        return new zzgem(zzger0, zzgpp0, zzgpo.zzb(ByteBuffer.allocate(5).put(1).putInt(((int)integer0)).array()), integer0);
    }
}

