package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

class zzfsj extends zzfux {
    final transient Map zza;
    final zzfsw zzb;

    zzfsj(zzfsw zzfsw0, Map map0) {
        this.zzb = zzfsw0;
        super();
        this.zza = map0;
    }

    @Override
    public final void clear() {
        zzfsw zzfsw0 = this.zzb;
        if(this.zza == zzfsw0.zza) {
            zzfsw0.zzp();
            return;
        }
        zzfun.zzb(new zzfsi(this));
    }

    @Override
    public final boolean containsKey(Object object0) {
        this.zza.getClass();
        try {
            return this.zza.containsKey(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return false;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 || this.zza.equals(object0);
    }

    @Override
    public final Object get(Object object0) {
        Collection collection0 = (Collection)zzfuy.zza(this.zza, object0);
        return collection0 == null ? null : this.zzb.zzc(object0, collection0);
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzfux
    public Set keySet() {
        return this.zzb.zzt();
    }

    @Override
    public final Object remove(Object object0) {
        Collection collection0 = (Collection)this.zza.remove(object0);
        if(collection0 == null) {
            return null;
        }
        Collection collection1 = this.zzb.zza();
        collection1.addAll(collection0);
        this.zzb.zzb -= collection0.size();
        collection0.clear();
        return collection1;
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }

    final Map.Entry zza(Map.Entry map$Entry0) {
        Object object0 = map$Entry0.getKey();
        Collection collection0 = (Collection)map$Entry0.getValue();
        return new zzftz(object0, this.zzb.zzc(object0, collection0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfux
    protected final Set zzb() {
        return new zzfsh(this);
    }
}

