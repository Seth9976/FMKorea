package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class zzfvv extends zzfvm implements Serializable {
    final zzfvm zza;

    zzfvv(zzfvm zzfvm0) {
        this.zza = zzfvm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvm
    public final int compare(Object object0, Object object1) {
        return this.zza.compare(object1, object0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfvv ? this.zza.equals(((zzfvv)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return -this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza.toString() + ".reverse()";
    }

    @Override  // com.google.android.gms.internal.ads.zzfvm
    public final zzfvm zza() {
        return this.zza;
    }
}

