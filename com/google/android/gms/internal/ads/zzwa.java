package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzwa implements Comparator {
    public static final zzwa zza;

    static {
        zzwa.zza = new zzwa();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return ((zzam)object1).zzi - ((zzam)object0).zzi;
    }
}

