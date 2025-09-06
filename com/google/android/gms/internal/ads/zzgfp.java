package com.google.android.gms.internal.ads;

public abstract class zzgfp {
    private final zzgpo zza;
    private final Class zzb;

    zzgfp(zzgpo zzgpo0, Class class0, zzgfo zzgfo0) {
        this.zza = zzgpo0;
        this.zzb = class0;
    }

    public abstract zzfzp zza(zzghh arg1, zzgas arg2);

    public static zzgfp zzb(zzgfn zzgfn0, zzgpo zzgpo0, Class class0) {
        return new zzgfm(zzgpo0, class0, zzgfn0);
    }

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

