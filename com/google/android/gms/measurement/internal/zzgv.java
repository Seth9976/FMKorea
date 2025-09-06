package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.Preconditions;

final class zzgv extends e {
    private final zzgp zza;

    zzgv(zzgp zzgp0, int v) {
        this.zza = zzgp0;
        super(20);
    }

    @Override  // androidx.collection.e
    protected final Object create(Object object0) {
        Preconditions.checkNotEmpty(((String)object0));
        return zzgp.zza(this.zza, ((String)object0));
    }
}

