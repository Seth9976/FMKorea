package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

final class zzfso extends zzfsr implements NavigableSet {
    final zzfsw zzb;

    zzfso(zzfsw zzfsw0, NavigableMap navigableMap0) {
        this.zzb = zzfsw0;
        super(zzfsw0, navigableMap0);
    }

    @Override
    public final Object ceiling(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).ceilingKey(object0);
    }

    @Override
    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).descendingMap();
        return new zzfso(this.zzb, navigableMap0);
    }

    @Override
    public final Object floor(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).floorKey(object0);
    }

    @Override
    public final NavigableSet headSet(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).headMap(object0, z);
        return new zzfso(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    public final SortedSet headSet(Object object0) {
        return this.headSet(object0, false);
    }

    @Override
    public final Object higher(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).higherKey(object0);
    }

    @Override
    public final Object lower(Object object0) {
        return ((NavigableMap)(((SortedMap)this.zzd))).lowerKey(object0);
    }

    @Override
    public final Object pollFirst() {
        return zzfun.zza(this.iterator());
    }

    @Override
    public final Object pollLast() {
        return zzfun.zza(this.descendingIterator());
    }

    @Override
    public final NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).subMap(object0, z, object1, z1);
        return new zzfso(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    public final SortedSet subSet(Object object0, Object object1) {
        return this.subSet(object0, true, object1, false);
    }

    @Override
    public final NavigableSet tailSet(Object object0, boolean z) {
        NavigableMap navigableMap0 = ((NavigableMap)(((SortedMap)this.zzd))).tailMap(object0, z);
        return new zzfso(this.zzb, navigableMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    public final SortedSet tailSet(Object object0) {
        return this.tailSet(object0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsr
    final SortedMap zza() {
        return (NavigableMap)(((SortedMap)this.zzd));
    }
}

