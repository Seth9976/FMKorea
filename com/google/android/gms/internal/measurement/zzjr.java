package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzjr extends zzjs {
    private static final Class zza;

    static {
        zzjr.zza = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    private zzjr() {
        super(null);
    }

    zzjr(zzju zzju0) {
    }

    private static List zza(Object object0, long v, int v1) {
        ArrayList arrayList0;
        List list0 = zzjr.zzc(object0, v);
        if(list0.isEmpty()) {
            if(list0 instanceof zzjp) {
                list0 = new zzjq(v1);
            }
            else if(!(list0 instanceof zzkv) || !(list0 instanceof zzjf)) {
                list0 = new ArrayList(v1);
            }
            else {
                list0 = ((zzjf)list0).zza(v1);
            }
            zzmg.zza(object0, v, list0);
            return list0;
        }
        Class class0 = list0.getClass();
        if(zzjr.zza.isAssignableFrom(class0)) {
            arrayList0 = new ArrayList(list0.size() + v1);
            arrayList0.addAll(list0);
            zzmg.zza(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzmb) {
            arrayList0 = new zzjq(list0.size() + v1);
            ((zzhg)arrayList0).addAll(((zzmb)list0));
            zzmg.zza(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzkv && list0 instanceof zzjf && !((zzjf)list0).zzc()) {
            list0 = ((zzjf)list0).zza(list0.size() + v1);
            zzmg.zza(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final List zza(Object object0, long v) {
        return zzjr.zza(object0, v, 10);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final void zza(Object object0, Object object1, long v) {
        List list0 = zzjr.zzc(object1, v);
        List list1 = zzjr.zza(object0, v, list0.size());
        int v1 = list1.size();
        if(v1 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v1 > 0) {
            list0 = list1;
        }
        zzmg.zza(object0, v, list0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final void zzb(Object object0, long v) {
        List list1;
        List list0 = (List)zzmg.zze(object0, v);
        if(list0 instanceof zzjp) {
            list1 = ((zzjp)list0).h_();
        }
        else {
            Class class0 = list0.getClass();
            if(zzjr.zza.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof zzkv && list0 instanceof zzjf) {
                if(((zzjf)list0).zzc()) {
                    ((zzjf)list0).i_();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        zzmg.zza(object0, v, list1);
    }

    private static List zzc(Object object0, long v) {
        return (List)zzmg.zze(object0, v);
    }
}

