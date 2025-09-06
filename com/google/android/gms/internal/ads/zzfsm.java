package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class zzfsm extends zzfuv {
    final zzfsw zza;

    zzfsm(zzfsw zzfsw0, Map map0) {
        this.zza = zzfsw0;
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfuv
    public final void clear() {
        zzfun.zzb(this.iterator());
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.zzd.keySet().containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 || this.zzd.keySet().equals(object0);
    }

    @Override
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuv
    public final Iterator iterator() {
        return new zzfsl(this, this.zzd.entrySet().iterator());
    }

    @Override  // com.google.android.gms.internal.ads.zzfuv
    public final boolean remove(Object object0) {
        Collection collection0 = (Collection)this.zzd.remove(object0);
        if(collection0 != null) {
            int v = collection0.size();
            collection0.clear();
            this.zza.zzb -= v;
            return v > 0;
        }
        return false;
    }
}

