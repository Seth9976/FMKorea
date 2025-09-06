package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgcg extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzgce zzd;

    zzgcg(int v, int v1, int v2, zzgce zzgce0, zzgcf zzgcf0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = 16;
        this.zzd = zzgce0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgcg ? ((zzgcg)object0).zza == this.zza && ((zzgcg)object0).zzb == this.zzb && ((zzgcg)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcg.class, this.zza, this.zzb, 16, this.zzd});
    }

    @Override
    public final String toString() {
        return "AesEax Parameters (variant: " + this.zzd + ", " + this.zzb + "-byte IV, " + 16 + "-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgce zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zzd != zzgce.zzc;
    }
}

