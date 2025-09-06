package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzghk {
    private final Class zza;
    private final zzgpo zzb;

    zzghk(Class class0, zzgpo zzgpo0, zzghj zzghj0) {
        this.zza = class0;
        this.zzb = zzgpo0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzghk ? ((zzghk)object0).zza.equals(this.zza) && ((zzghk)object0).zzb.equals(this.zzb) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + this.zzb;
    }
}

