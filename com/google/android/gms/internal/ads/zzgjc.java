package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgjc extends zzgjf {
    private final int zza;
    private final int zzb;
    private final zzgja zzc;
    private final zzgiz zzd;

    zzgjc(int v, int v1, zzgja zzgja0, zzgiz zzgiz0, zzgjb zzgjb0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = zzgja0;
        this.zzd = zzgiz0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgjc ? ((zzgjc)object0).zza == this.zza && ((zzgjc)object0).zzc() == this.zzc() && ((zzgjc)object0).zzc == this.zzc && ((zzgjc)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgjc.class, this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return "HMAC Parameters (variant: " + this.zzc + ", hashType: " + this.zzd + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgja zzgja0 = this.zzc;
        if(zzgja0 == zzgja.zzd) {
            return this.zzb;
        }
        if(zzgja0 != zzgja.zza && (zzgja0 != zzgja.zzb && zzgja0 != zzgja.zzc)) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.zzb + 5;
    }

    public static zzgiy zzd() {
        return new zzgiy(null);
    }

    public final zzgiz zze() {
        return this.zzd;
    }

    public final zzgja zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzc != zzgja.zzd;
    }
}

