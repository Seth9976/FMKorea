package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzavh implements Comparator {
    zzavh(zzavj zzavj0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((zzavn)object0).zzc - ((zzavn)object1).zzc;
        return v == 0 ? Long.compare(((zzavn)object0).zza, ((zzavn)object1).zza) : v;
    }
}

