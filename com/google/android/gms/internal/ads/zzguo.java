package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzguo implements Iterator {
    final Iterator zza;
    final zzgup zzb;

    zzguo(zzgup zzgup0) {
        this.zzb = zzgup0;
        super();
        this.zza = zzgup.zza(zzgup0).iterator();
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

