package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

class zzfsk implements Iterator {
    final Iterator zza;
    Object zzb;
    Collection zzc;
    Iterator zzd;
    final zzfsw zze;

    zzfsk(zzfsw zzfsw0) {
        this.zze = zzfsw0;
        super();
        this.zza = zzfsw0.zza.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfum.zza;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.zzd.hasNext()) {
            Object object0 = this.zza.next();
            this.zzb = ((Map.Entry)object0).getKey();
            Collection collection0 = (Collection)((Map.Entry)object0).getValue();
            this.zzc = collection0;
            this.zzd = collection0.iterator();
        }
        return this.zzd.next();
    }

    @Override
    public final void remove() {
        this.zzd.remove();
        Collection collection0 = this.zzc;
        collection0.getClass();
        if(collection0.isEmpty()) {
            this.zza.remove();
        }
        --this.zze.zzb;
    }
}

