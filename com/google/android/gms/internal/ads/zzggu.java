package com.google.android.gms.internal.ads;

public abstract class zzggu {
    private final Class zza;
    private final Class zzb;

    zzggu(Class class0, Class class1, zzggt zzggt0) {
        this.zza = class0;
        this.zzb = class1;
    }

    public abstract Object zza(zzfzp arg1);

    public static zzggu zzb(zzggs zzggs0, Class class0, Class class1) {
        return new zzggr(class0, class1, zzggs0);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

