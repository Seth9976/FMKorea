package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzftk extends zzfsx {
    final zzftm zza;
    private final Object zzb;
    private int zzc;

    zzftk(zzftm zzftm0, int v) {
        this.zza = zzftm0;
        super();
        Object[] arr_object = zzftm0.zzb;
        arr_object.getClass();
        this.zzb = arr_object[v];
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final Object getKey() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final Object getValue() {
        Map map0 = this.zza.zzj();
        if(map0 != null) {
            return map0.get(this.zzb);
        }
        this.zza();
        int v = this.zzc;
        if(v == -1) {
            return null;
        }
        Object[] arr_object = this.zza.zzc;
        arr_object.getClass();
        return arr_object[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzfsx
    public final Object setValue(Object object0) {
        Map map0 = this.zza.zzj();
        if(map0 != null) {
            return map0.put(this.zzb, object0);
        }
        this.zza();
        int v = this.zzc;
        if(v == -1) {
            this.zza.put(this.zzb, object0);
            return null;
        }
        Object[] arr_object = this.zza.zzc;
        arr_object.getClass();
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    private final void zza() {
        if(this.zzc != -1 && this.zzc < this.zza.size()) {
            int v = this.zzc;
            Object[] arr_object = this.zza.zzb;
            arr_object.getClass();
            if(zzfrd.zza(this.zzb, arr_object[v])) {
                return;
            }
        }
        this.zzc = this.zza.zzq(this.zzb);
    }
}

