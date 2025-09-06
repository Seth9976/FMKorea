package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class zzbe implements Iterator {
    private Iterator zza;
    private final zzbb zzb;

    zzbe(zzbb zzbb0) {
        this.zzb = zzbb0;
        super();
        this.zza = zzbb0.zza.keySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        return this.zza.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

