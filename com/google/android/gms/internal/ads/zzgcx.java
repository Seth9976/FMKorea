package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgcx extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzgcv zzd;

    zzgcx(int v, int v1, int v2, zzgcv zzgcv0, zzgcw zzgcw0) {
        this.zza = v;
        this.zzb = 12;
        this.zzc = 16;
        this.zzd = zzgcv0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgcx ? ((zzgcx)object0).zza == this.zza && ((zzgcx)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcx.class, this.zza, 12, 16, this.zzd});
    }

    @Override
    public final String toString() {
        return "AesGcm Parameters (variant: " + this.zzd + ", " + 12 + "-byte IV, " + 16 + "-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgcv zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzgcv.zzc;
    }
}

