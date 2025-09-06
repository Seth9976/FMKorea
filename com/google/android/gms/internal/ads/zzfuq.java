package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzfuq extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfqw zzb;

    zzfuq(List list0, zzfqw zzfqw0) {
        this.zza = list0;
        this.zzb = zzfqw0;
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzfup(this, this.zza.listIterator(v));
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zza.subList(v, v1).clear();
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

