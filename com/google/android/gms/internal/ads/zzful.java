package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzful extends zzfwd {
    boolean zza;
    final Object zzb;

    zzful(Object object0) {
        this.zzb = object0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override
    public final Object next() {
        if(this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}

