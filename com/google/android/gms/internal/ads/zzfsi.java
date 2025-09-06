package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzfsi implements Iterator {
    final Iterator zza;
    Collection zzb;
    final zzfsj zzc;

    zzfsi(zzfsj zzfsj0) {
        this.zzc = zzfsj0;
        super();
        this.zza = zzfsj0.zza.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zza.next();
        this.zzb = (Collection)((Map.Entry)object0).getValue();
        return this.zzc.zza(((Map.Entry)object0));
    }

    @Override
    public final void remove() {
        zzfri.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        this.zzc.zzb.zzb -= this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}

