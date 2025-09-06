package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

class zzftw extends zzftx {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzftw(int v) {
        this.zza = new Object[v];
        this.zzb = 0;
    }

    public final zzftw zza(Object object0) {
        object0.getClass();
        this.zzf(this.zzb + 1);
        int v = this.zzb;
        this.zzb = v + 1;
        this.zza[v] = object0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzftx
    public zzftx zzb(Object object0) {
        throw null;
    }

    public final zzftx zzc(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.zzf(this.zzb + ((Collection)iterable0).size());
            if(((Collection)iterable0) instanceof zzfty) {
                this.zzb = ((zzfty)(((Collection)iterable0))).zza(this.zza, this.zzb);
                return this;
            }
        }
        for(Object object0: iterable0) {
            this.zzb(object0);
        }
        return this;
    }

    final void zzd(Object[] arr_object, int v) {
        zzfvl.zzb(arr_object, 2);
        this.zzf(this.zzb + 2);
        System.arraycopy(arr_object, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    private final void zzf(int v) {
        Object[] arr_object = this.zza;
        if(arr_object.length < v) {
            this.zza = Arrays.copyOf(arr_object, zzftx.zze(arr_object.length, v));
            this.zzc = false;
            return;
        }
        if(this.zzc) {
            this.zza = (Object[])arr_object.clone();
            this.zzc = false;
        }
    }
}

