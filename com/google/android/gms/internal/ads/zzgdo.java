package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgdo extends zzgaw {
    private final int zza;
    private final zzgdm zzb;

    zzgdo(int v, zzgdm zzgdm0, zzgdn zzgdn0) {
        this.zza = v;
        this.zzb = zzgdm0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgdo ? ((zzgdo)object0).zza == this.zza && ((zzgdo)object0).zzb == this.zzb : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdo.class, this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + this.zzb + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgdm zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzgdm.zzc;
    }
}

