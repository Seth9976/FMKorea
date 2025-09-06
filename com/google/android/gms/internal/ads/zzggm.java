package com.google.android.gms.internal.ads;

public abstract class zzggm {
    private final zzgpo zza;
    private final Class zzb;

    zzggm(zzgpo zzgpo0, Class class0, zzggl zzggl0) {
        this.zza = zzgpo0;
        this.zzb = class0;
    }

    public abstract zzgah zza(zzghh arg1);

    public static zzggm zzb(zzggk zzggk0, zzgpo zzgpo0, Class class0) {
        return new zzggj(zzgpo0, class0, zzggk0);
    }

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

