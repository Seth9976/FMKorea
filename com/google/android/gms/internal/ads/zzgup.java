package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzgup extends AbstractList implements zzgsi, RandomAccess {
    private final zzgsi zza;

    public zzgup(zzgsi zzgsi0) {
        this.zza = zzgsi0;
    }

    @Override
    public final Object get(int v) {
        return ((zzgsh)this.zza).zzg(v);
    }

    @Override
    public final Iterator iterator() {
        return new zzguo(this);
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new zzgun(this, v);
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    static zzgsi zza(zzgup zzgup0) {
        return zzgup0.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final zzgsi zze() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final Object zzf(int v) {
        return this.zza.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgsi
    public final void zzi(zzgqi zzgqi0) {
        throw new UnsupportedOperationException();
    }
}

