package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class zzftl extends AbstractCollection {
    final zzftm zza;

    zzftl(zzftm zzftm0) {
        this.zza = zzftm0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final Iterator iterator() {
        zzftm zzftm0 = this.zza;
        Map map0 = zzftm0.zzj();
        return map0 != null ? map0.values().iterator() : new zzftf(zzftm0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

