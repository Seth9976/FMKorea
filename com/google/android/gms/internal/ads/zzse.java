package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzse implements Comparator {
    public final zzso zza;

    public zzse(zzso zzso0) {
        this.zza = zzso0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return this.zza.zza(object1) - this.zza.zza(object0);
    }
}

