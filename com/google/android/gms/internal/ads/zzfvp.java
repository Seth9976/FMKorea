package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzfvp extends zzfui {
    private final transient zzfug zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzfvp(zzfug zzfug0, Object[] arr_object, int v, int v1) {
        this.zza = zzfug0;
        this.zzb = arr_object;
        this.zzc = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean contains(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return object2 != null && object2.equals(this.zza.get(object1));
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final Iterator iterator() {
        return this.zzd().zzr(0);
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final int zza(Object[] arr_object, int v) {
        return this.zzd().zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfwd zze() {
        return this.zzd().zzr(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    final boolean zzf() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    final zzfud zzi() {
        return new zzfvo(this);
    }

    static int zzs(zzfvp zzfvp0) {
        return zzfvp0.zzc;
    }

    static Object[] zzt(zzfvp zzfvp0) {
        return zzfvp0.zzb;
    }
}

