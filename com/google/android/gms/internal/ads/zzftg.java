package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzftg extends AbstractSet {
    final zzftm zza;

    zzftg(zzftm zzftm0) {
        this.zza = zzftm0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        Map map0 = this.zza.zzj();
        if(map0 != null) {
            return map0.entrySet().contains(object0);
        }
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            int v = zzftm.zzd(this.zza, object1);
            if(v != -1) {
                Object[] arr_object = this.zza.zzc;
                arr_object.getClass();
                return zzfrd.zza(arr_object[v], ((Map.Entry)object0).getValue());
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        zzftm zzftm0 = this.zza;
        Map map0 = zzftm0.zzj();
        return map0 != null ? map0.entrySet().iterator() : new zzfte(zzftm0);
    }

    @Override
    public final boolean remove(Object object0) {
        Map map0 = this.zza.zzj();
        if(map0 != null) {
            return map0.entrySet().remove(object0);
        }
        if(object0 instanceof Map.Entry) {
            zzftm zzftm0 = this.zza;
            if(zzftm0.zzo()) {
                return false;
            }
            int v = zzftm.zzc(zzftm0);
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            Object object3 = zzftm.zzh(this.zza);
            int[] arr_v = this.zza.zza;
            arr_v.getClass();
            Object[] arr_object = this.zza.zzb;
            arr_object.getClass();
            Object[] arr_object1 = this.zza.zzc;
            arr_object1.getClass();
            int v1 = zzftn.zzb(object1, object2, v, object3, arr_v, arr_object, arr_object1);
            if(v1 == -1) {
                return false;
            }
            this.zza.zzn(v1, v);
            zzftm.zzk(this.zza, zzftm.zzb(this.zza) - 1);
            this.zza.zzl();
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.zza.size();
    }
}

