package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

final class zzdg extends zzdk {
    boolean zza;
    final Object zzb;

    zzdg(Object object0) {
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

