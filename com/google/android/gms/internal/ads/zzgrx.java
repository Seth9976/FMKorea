package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

public final class zzgrx extends AbstractList {
    private final List zza;
    private final zzgrw zzb;

    public zzgrx(List list0, zzgrw zzgrw0) {
        this.zza = list0;
        this.zzb = zzgrw0;
    }

    @Override
    public final Object get(int v) {
        zzayc zzayc0 = zzayc.zzb(((int)(((Integer)this.zza.get(v)))));
        return zzayc0 == null ? zzayc.zza : zzayc0;
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

