package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class zzftj extends AbstractSet {
    final zzftm zza;

    zzftj(zzftm zzftm0) {
        this.zza = zzftm0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.zza.containsKey(object0);
    }

    @Override
    public final Iterator iterator() {
        zzftm zzftm0 = this.zza;
        Map map0 = zzftm0.zzj();
        return map0 != null ? map0.keySet().iterator() : new zzftd(zzftm0);
    }

    @Override
    public final boolean remove(Object object0) {
        Map map0 = this.zza.zzj();
        return map0 == null ? zzftm.zzg(this.zza, object0) != zzftm.zzi() : map0.keySet().remove(object0);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

