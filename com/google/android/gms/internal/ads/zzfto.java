package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

final class zzfto extends zzfvm implements Serializable {
    final Comparator zza;

    zzfto(Comparator comparator0) {
        this.zza = comparator0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvm
    public final int compare(Object object0, Object object1) {
        return this.zza.compare(object0, object1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfto ? this.zza.equals(((zzfto)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }
}

