package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzkf implements zzkg {
    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final int zza(int v, Object object0, Object object1) {
        zzkb zzkb0 = (zzkb)object1;
        if(((zzkd)object0).isEmpty()) {
            return 0;
        }
        Iterator iterator0 = ((zzkd)object0).entrySet().iterator();
        if(!iterator0.hasNext()) {
            return 0;
        }
        Object object2 = iterator0.next();
        ((Map.Entry)object2).getKey();
        ((Map.Entry)object2).getValue();
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final zzke zza(Object object0) {
        zzkb zzkb0 = (zzkb)object0;
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final Object zza(Object object0, Object object1) {
        zzkd zzkd0 = (zzkd)object0;
        if(!((zzkd)object1).isEmpty()) {
            if(!zzkd0.zzd()) {
                zzkd0 = zzkd0.zzb();
            }
            zzkd0.zza(((zzkd)object1));
        }
        return zzkd0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final Object zzb(Object object0) {
        return zzkd.zza().zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final Object zzc(Object object0) {
        ((zzkd)object0).zzc();
        return object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final Map zzd(Object object0) {
        return (zzkd)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final Map zze(Object object0) {
        return (zzkd)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkg
    public final boolean zzf(Object object0) {
        return !((zzkd)object0).zzd();
    }
}

