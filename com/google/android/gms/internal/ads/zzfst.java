package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class zzfst extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfst zzc;
    final Collection zzd;
    final zzfsw zze;

    zzfst(zzfsw zzfsw0, Object object0, Collection collection0, zzfst zzfst0) {
        this.zze = zzfsw0;
        super();
        this.zza = object0;
        this.zzb = collection0;
        this.zzc = zzfst0;
        this.zzd = zzfst0 == null ? null : zzfst0.zzb;
    }

    @Override
    public final boolean add(Object object0) {
        this.zzb();
        boolean z = this.zzb.isEmpty();
        boolean z1 = this.zzb.add(object0);
        if(z1) {
            ++this.zze.zzb;
            if(z) {
                this.zza();
                return true;
            }
        }
        return z1;
    }

    @Override
    public final boolean addAll(Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.size();
        boolean z = this.zzb.addAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            if(v == 0) {
                this.zza();
                return true;
            }
        }
        return z;
    }

    @Override
    public final void clear() {
        int v = this.size();
        if(v == 0) {
            return;
        }
        this.zzb.clear();
        this.zze.zzb -= v;
        this.zzc();
    }

    @Override
    public final boolean contains(Object object0) {
        this.zzb();
        return this.zzb.contains(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        this.zzb();
        return this.zzb.containsAll(collection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        this.zzb();
        return this.zzb.equals(object0);
    }

    @Override
    public final int hashCode() {
        this.zzb();
        return this.zzb.hashCode();
    }

    @Override
    public final Iterator iterator() {
        this.zzb();
        return new zzfss(this);
    }

    @Override
    public final boolean remove(Object object0) {
        this.zzb();
        boolean z = this.zzb.remove(object0);
        if(z) {
            --this.zze.zzb;
            this.zzc();
        }
        return z;
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.size();
        boolean z = this.zzb.removeAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            this.zzc();
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        collection0.getClass();
        int v = this.size();
        boolean z = this.zzb.retainAll(collection0);
        if(z) {
            this.zze.zzb += this.zzb.size() - v;
            this.zzc();
        }
        return z;
    }

    @Override
    public final int size() {
        this.zzb();
        return this.zzb.size();
    }

    @Override
    public final String toString() {
        this.zzb();
        return this.zzb.toString();
    }

    final void zza() {
        zzfst zzfst0 = this.zzc;
        if(zzfst0 != null) {
            zzfst0.zza();
            return;
        }
        this.zze.zza.put(this.zza, this.zzb);
    }

    final void zzb() {
        zzfst zzfst0 = this.zzc;
        if(zzfst0 != null) {
            zzfst0.zzb();
            if(this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        }
        else if(this.zzb.isEmpty()) {
            Collection collection0 = (Collection)this.zze.zza.get(this.zza);
            if(collection0 != null) {
                this.zzb = collection0;
            }
        }
    }

    final void zzc() {
        zzfst zzfst0 = this.zzc;
        if(zzfst0 != null) {
            zzfst0.zzc();
            return;
        }
        if(this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }
}

