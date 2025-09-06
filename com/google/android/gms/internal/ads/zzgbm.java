package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgbm extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgbk zze;
    private final zzgbj zzf;

    zzgbm(int v, int v1, int v2, int v3, zzgbk zzgbk0, zzgbj zzgbj0, zzgbl zzgbl0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = zzgbk0;
        this.zzf = zzgbj0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgbm ? ((zzgbm)object0).zza == this.zza && ((zzgbm)object0).zzb == this.zzb && ((zzgbm)object0).zzc == this.zzc && ((zzgbm)object0).zzd == this.zzd && ((zzgbm)object0).zze == this.zze && ((zzgbm)object0).zzf == this.zzf : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbm.class, this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf});
    }

    @Override
    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.zze + ", hashType: " + this.zzf + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final zzgbj zze() {
        return this.zzf;
    }

    public final zzgbk zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zze != zzgbk.zzc;
    }
}

