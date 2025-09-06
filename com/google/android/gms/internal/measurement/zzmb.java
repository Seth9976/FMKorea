package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzmb extends AbstractList implements zzjp, RandomAccess {
    private final zzjp zza;

    public zzmb(zzjp zzjp0) {
        this.zza = zzjp0;
    }

    @Override
    public final Object get(int v) {
        return (String)this.zza.get(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final zzjp h_() {
        return this;
    }

    @Override
    public final Iterator iterator() {
        return new zzmd(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzme(this, v);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final void zza(zzhm zzhm0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final Object zzb(int v) {
        return this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final List zzb() {
        return this.zza.zzb();
    }
}

