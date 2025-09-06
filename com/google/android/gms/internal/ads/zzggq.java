package com.google.android.gms.internal.ads;

public abstract class zzggq {
    private final Class zza;
    private final Class zzb;

    zzggq(Class class0, Class class1, zzggp zzggp0) {
        this.zza = class0;
        this.zzb = class1;
    }

    public abstract zzghh zza(zzgah arg1);

    public static zzggq zzb(zzggo zzggo0, Class class0, Class class1) {
        return new zzggn(class0, class1, zzggo0);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

