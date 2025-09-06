package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

abstract class zzfsw extends zzfsz implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfsw(Map map0) {
        zzfri.zze(map0.isEmpty());
        this.zza = map0;
    }

    abstract Collection zza();

    Collection zzb(Collection collection0) {
        throw null;
    }

    Collection zzc(Object object0, Collection collection0) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuz
    public final int zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    final Collection zzf() {
        return new zzfsy(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    final Iterator zzg() {
        return new zzfsg(this);
    }

    final List zzh(Object object0, List list0, zzfst zzfst0) {
        return list0 instanceof RandomAccess ? new zzfsp(this, object0, list0, zzfst0) : new zzfsv(this, object0, list0, zzfst0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    Map zzj() {
        throw null;
    }

    final Map zzk() {
        Map map0 = this.zza;
        if(map0 instanceof NavigableMap) {
            return new zzfsn(this, ((NavigableMap)map0));
        }
        return map0 instanceof SortedMap ? new zzfsq(this, ((SortedMap)map0)) : new zzfsj(this, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    Set zzl() {
        throw null;
    }

    final Set zzm() {
        Map map0 = this.zza;
        if(map0 instanceof NavigableMap) {
            return new zzfso(this, ((NavigableMap)map0));
        }
        return map0 instanceof SortedMap ? new zzfsr(this, ((SortedMap)map0)) : new zzfsm(this, map0);
    }

    static void zzo(zzfsw zzfsw0, Object object0) {
        Object object1;
        try {
            object1 = zzfsw0.zza.remove(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            object1 = null;
        }
        if(((Collection)object1) != null) {
            ((Collection)object1).clear();
            zzfsw0.zzb -= ((Collection)object1).size();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfuz
    public final void zzp() {
        for(Object object0: this.zza.values()) {
            ((Collection)object0).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsz
    public final boolean zzq(Object object0, Object object1) {
        Collection collection0 = (Collection)this.zza.get(object0);
        if(collection0 == null) {
            Collection collection1 = this.zza();
            if(!collection1.add(object1)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            ++this.zzb;
            this.zza.put(object0, collection1);
            return true;
        }
        if(collection0.add(object1)) {
            ++this.zzb;
            return true;
        }
        return false;
    }
}

