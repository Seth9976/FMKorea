package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzgtq implements Iterator {
    private final ArrayDeque zza;
    private zzgqd zzb;

    zzgtq(zzgqi zzgqi0, zzgtp zzgtp0) {
        if(zzgqi0 instanceof zzgts) {
            ArrayDeque arrayDeque0 = new ArrayDeque(((zzgts)zzgqi0).zzf());
            this.zza = arrayDeque0;
            arrayDeque0.push(((zzgts)zzgqi0));
            this.zzb = this.zzb(((zzgts)zzgqi0).zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgqd)zzgqi0;
    }

    @Override
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override
    public final Object next() {
        return this.zza();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final zzgqd zza() {
        zzgqd zzgqd1;
        zzgqd zzgqd0 = this.zzb;
        if(zzgqd0 == null) {
            throw new NoSuchElementException();
        }
        do {
            zzgqd1 = null;
            if(this.zza == null || this.zza.isEmpty()) {
                break;
            }
            zzgqd1 = this.zzb(zzgts.zzB(((zzgts)this.zza.pop())));
        }
        while(zzgqd1.zzd() == 0);
        this.zzb = zzgqd1;
        return zzgqd0;
    }

    private final zzgqd zzb(zzgqi zzgqi0) {
        while(zzgqi0 instanceof zzgts) {
            this.zza.push(((zzgts)zzgqi0));
            zzgqi0 = zzgts.zzg(((zzgts)zzgqi0));
        }
        return (zzgqd)zzgqi0;
    }
}

