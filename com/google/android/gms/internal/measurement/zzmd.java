package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzmd implements Iterator {
    private Iterator zza;
    private final zzmb zzb;

    zzmd(zzmb zzmb0) {
        this.zzb = zzmb0;
        super();
        this.zza = zzmb0.zza.iterator();
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
        throw new UnsupportedOperationException();
    }
}

