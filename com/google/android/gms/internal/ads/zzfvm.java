package com.google.android.gms.internal.ads;

import java.util.Comparator;

public abstract class zzfvm implements Comparator {
    @Override
    public abstract int compare(Object arg1, Object arg2);

    public zzfvm zza() {
        return new zzfvv(this);
    }

    public static zzfvm zzb(Comparator comparator0) {
        return comparator0 instanceof zzfvm ? ((zzfvm)comparator0) : new zzfto(comparator0);
    }

    public static zzfvm zzc() {
        return zzfvk.zza;
    }
}

