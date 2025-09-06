package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgie extends zzgjf {
    private final int zza;
    private final int zzb;
    private final zzgic zzc;

    zzgie(int v, int v1, zzgic zzgic0, zzgid zzgid0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = zzgic0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgie ? ((zzgie)object0).zza == this.zza && ((zzgie)object0).zzc() == this.zzc() && ((zzgie)object0).zzc == this.zzc : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgie.class, this.zza, this.zzb, this.zzc});
    }

    @Override
    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.zzc + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgic zzgic0 = this.zzc;
        if(zzgic0 == zzgic.zzd) {
            return this.zzb;
        }
        if(zzgic0 != zzgic.zza && (zzgic0 != zzgic.zzb && zzgic0 != zzgic.zzc)) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.zzb + 5;
    }

    public final zzgic zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zzc != zzgic.zzd;
    }
}

