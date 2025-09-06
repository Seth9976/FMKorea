package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class zzfsq extends zzfsj implements SortedMap {
    SortedSet zzd;
    final zzfsw zze;

    zzfsq(zzfsw zzfsw0, SortedMap sortedMap0) {
        this.zze = zzfsw0;
        super(zzfsw0, sortedMap0);
    }

    @Override
    public final Comparator comparator() {
        return this.zzf().comparator();
    }

    @Override
    public final Object firstKey() {
        return this.zzf().firstKey();
    }

    @Override
    public SortedMap headMap(Object object0) {
        SortedMap sortedMap0 = this.zzf().headMap(object0);
        return new zzfsq(this.zze, sortedMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfsj
    public Set keySet() {
        return this.zzh();
    }

    @Override
    public final Object lastKey() {
        return this.zzf().lastKey();
    }

    @Override
    public SortedMap subMap(Object object0, Object object1) {
        SortedMap sortedMap0 = this.zzf().subMap(object0, object1);
        return new zzfsq(this.zze, sortedMap0);
    }

    @Override
    public SortedMap tailMap(Object object0) {
        SortedMap sortedMap0 = this.zzf().tailMap(object0);
        return new zzfsq(this.zze, sortedMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfux
    Set zze() {
        return this.zzg();
    }

    SortedMap zzf() {
        return (SortedMap)this.zza;
    }

    SortedSet zzg() {
        SortedMap sortedMap0 = this.zzf();
        return new zzfsr(this.zze, sortedMap0);
    }

    public SortedSet zzh() {
        SortedSet sortedSet0 = this.zzd;
        if(sortedSet0 == null) {
            sortedSet0 = this.zzg();
            this.zzd = sortedSet0;
        }
        return sortedSet0;
    }
}

