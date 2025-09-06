package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgdz extends zzgaw {
    private final zzgdy zza;

    private zzgdz(zzgdy zzgdy0) {
        this.zza = zzgdy0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgdz ? ((zzgdz)object0).zza == this.zza : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdz.class, this.zza});
    }

    @Override
    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    public final zzgdy zza() {
        return this.zza;
    }

    public static zzgdz zzb(zzgdy zzgdy0) {
        return new zzgdz(zzgdy0);
    }
}

