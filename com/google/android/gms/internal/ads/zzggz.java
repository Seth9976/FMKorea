package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzggz {
    private final Class zza;
    private final Class zzb;

    zzggz(Class class0, Class class1, zzggy zzggy0) {
        this.zza = class0;
        this.zzb = class1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzggz ? ((zzggz)object0).zza.equals(this.zza) && ((zzggz)object0).zzb.equals(this.zzb) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }
}

