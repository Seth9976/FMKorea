package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzfti implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final zzftm zze;

    zzfti(zzftm zzftm0, zzfth zzfth0) {
        this.zze = zzftm0;
        super();
        this.zzb = zzftm.zza(zzftm0);
        this.zzc = zzftm0.zze();
        this.zzd = -1;
    }

    @Override
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override
    public final Object next() {
        this.zzb();
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzd = this.zzc;
        Object object0 = this.zza(this.zzc);
        this.zzc = this.zze.zzf(this.zzc);
        return object0;
    }

    @Override
    public final void remove() {
        this.zzb();
        zzfri.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 0x20;
        int v = this.zzd;
        Object[] arr_object = this.zze.zzb;
        arr_object.getClass();
        this.zze.remove(arr_object[v]);
        --this.zzc;
        this.zzd = -1;
    }

    abstract Object zza(int arg1);

    private final void zzb() {
        if(zzftm.zza(this.zze) != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}

