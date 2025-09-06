package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;

public final class zzfuf {
    Object[] zza;
    int zzb;
    zzfue zzc;

    public zzfuf() {
        this(4);
    }

    zzfuf(int v) {
        this.zza = new Object[v + v];
        this.zzb = 0;
    }

    public final zzfuf zza(Object object0, Object object1) {
        this.zzd(this.zzb + 1);
        zzfta.zzb(object0, object1);
        Object[] arr_object = this.zza;
        int v = this.zzb;
        int v1 = v + v;
        arr_object[v1] = object0;
        arr_object[v1 + 1] = object1;
        this.zzb = v + 1;
        return this;
    }

    public final zzfuf zzb(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.zzd(this.zzb + ((Collection)iterable0).size());
        }
        for(Object object0: iterable0) {
            this.zza(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return this;
    }

    public final zzfug zzc() {
        zzfue zzfue0 = this.zzc;
        if(zzfue0 != null) {
            throw zzfue0.zza();
        }
        zzfug zzfug0 = zzfvs.zzj(this.zzb, this.zza, this);
        zzfue zzfue1 = this.zzc;
        if(zzfue1 != null) {
            throw zzfue1.zza();
        }
        return zzfug0;
    }

    private final void zzd(int v) {
        Object[] arr_object = this.zza;
        int v1 = v + v;
        if(v1 > arr_object.length) {
            this.zza = Arrays.copyOf(arr_object, zzftx.zze(arr_object.length, v1));
        }
    }
}

