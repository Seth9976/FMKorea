package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class zzfss implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final zzfst zzc;

    zzfss(zzfst zzfst0) {
        this.zzc = zzfst0;
        super();
        Collection collection0 = zzfst0.zzb;
        this.zzb = collection0;
        Iterator iterator0 = collection0 instanceof List ? ((List)collection0).listIterator() : collection0.iterator();
        this.zza = iterator0;
    }

    zzfss(zzfst zzfst0, Iterator iterator0) {
        this.zzc = zzfst0;
        super();
        this.zzb = zzfst0.zzb;
        this.zza = iterator0;
    }

    @Override
    public final boolean hasNext() {
        this.zza();
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        this.zza();
        return this.zza.next();
    }

    @Override
    public final void remove() {
        this.zza.remove();
        --this.zzc.zze.zzb;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if(this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}

