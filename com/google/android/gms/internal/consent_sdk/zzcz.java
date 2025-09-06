package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

abstract class zzcz extends zzdl {
    private final int zza;
    private int zzb;

    protected zzcz(int v, int v1) {
        zzcx.zzb(v1, v, "index");
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.zzb;
        this.zzb = v + 1;
        return this.zza(v);
    }

    @Override
    public final int nextIndex() {
        return this.zzb;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.zzb - 1;
        this.zzb = v;
        return this.zza(v);
    }

    @Override
    public final int previousIndex() {
        return this.zzb - 1;
    }

    protected abstract Object zza(int arg1);
}

