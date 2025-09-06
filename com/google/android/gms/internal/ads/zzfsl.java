package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzfsl implements Iterator {
    Map.Entry zza;
    final Iterator zzb;
    final zzfsm zzc;

    zzfsl(zzfsm zzfsm0, Iterator iterator0) {
        this.zzc = zzfsm0;
        this.zzb = iterator0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zzb.next();
        this.zza = (Map.Entry)object0;
        return ((Map.Entry)object0).getKey();
    }

    @Override
    public final void remove() {
        zzfri.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection0 = (Collection)this.zza.getValue();
        this.zzb.remove();
        this.zzc.zza.zzb -= collection0.size();
        collection0.clear();
        this.zza = null;
    }
}

