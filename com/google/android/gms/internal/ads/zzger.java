package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzger extends zzgaw {
    private final zzgeq zza;

    private zzger(zzgeq zzgeq0) {
        this.zza = zzgeq0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzger ? ((zzger)object0).zza == this.zza : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzger.class, this.zza});
    }

    @Override
    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    public final zzgeq zza() {
        return this.zza;
    }

    public static zzger zzb(zzgeq zzgeq0) {
        return new zzger(zzgeq0);
    }
}

