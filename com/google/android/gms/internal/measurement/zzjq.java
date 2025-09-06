package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzjq extends zzhg implements zzjp, RandomAccess {
    private static final zzjq zza;
    @Deprecated
    private static final zzjp zzb;
    private final List zzc;

    static {
        zzjq zzjq0 = new zzjq(false);
        zzjq.zza = zzjq0;
        zzjq.zzb = zzjq0;
    }

    public zzjq() {
        this(10);
    }

    public zzjq(int v) {
        this(new ArrayList(v));
    }

    private zzjq(ArrayList arrayList0) {
        this.zzc = arrayList0;
    }

    private zzjq(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final void add(int v, Object object0) {
        this.zza();
        this.zzc.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean addAll(int v, Collection collection0) {
        this.zza();
        if(collection0 instanceof zzjp) {
            collection0 = ((zzjp)collection0).zzb();
        }
        boolean z = this.zzc.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final void clear() {
        this.zza();
        this.zzc.clear();
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override
    public final Object get(int v) {
        Object object0 = this.zzc.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzhm) {
            String s = ((zzhm)object0).zzc();
            if(((zzhm)object0).zzd()) {
                this.zzc.set(v, s);
            }
            return s;
        }
        String s1 = zziz.zzb(((byte[])object0));
        if(zziz.zzc(((byte[])object0))) {
            this.zzc.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final zzjp h_() {
        return this.zzc() ? new zzmb(this) : this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final Object remove(int v) {
        this.zza();
        Object object0 = this.zzc.remove(v);
        ++this.modCount;
        return zzjq.zza(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final Object set(int v, Object object0) {
        this.zza();
        return zzjq.zza(this.zzc.set(v, ((String)object0)));
    }

    @Override
    public final int size() {
        return this.zzc.size();
    }

    private static String zza(Object object0) {
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzhm ? ((zzhm)object0).zzc() : zziz.zzb(((byte[])object0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzjf
    public final zzjf zza(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.zzc);
        return new zzjq(arrayList0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final void zza(zzhm zzhm0) {
        this.zza();
        this.zzc.add(zzhm0);
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final Object zzb(int v) {
        return this.zzc.get(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjp
    public final List zzb() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean zzc() {
        return super.zzc();
    }
}

