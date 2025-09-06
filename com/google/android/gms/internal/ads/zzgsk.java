package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzgsk extends zzgso {
    private static final Class zza;

    static {
        zzgsk.zza = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }

    private zzgsk() {
        super(null);
    }

    zzgsk(zzgsj zzgsj0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final List zza(Object object0, long v) {
        return zzgsk.zzf(object0, v, 10);
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final void zzb(Object object0, long v) {
        List list1;
        List list0 = (List)zzguu.zzh(object0, v);
        if(list0 instanceof zzgsi) {
            list1 = ((zzgsi)list0).zze();
        }
        else {
            Class class0 = list0.getClass();
            if(zzgsk.zza.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof zzgth && list0 instanceof zzgrz) {
                if(((zzgrz)list0).zzc()) {
                    ((zzgrz)list0).zzb();
                }
                return;
            }
            list1 = Collections.unmodifiableList(list0);
        }
        zzguu.zzv(object0, v, list1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final void zzc(Object object0, Object object1, long v) {
        List list0 = (List)zzguu.zzh(object1, v);
        List list1 = zzgsk.zzf(object0, v, list0.size());
        int v1 = list1.size();
        if(v1 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v1 > 0) {
            list0 = list1;
        }
        zzguu.zzv(object0, v, list0);
    }

    private static List zzf(Object object0, long v, int v1) {
        ArrayList arrayList0;
        List list0 = (List)zzguu.zzh(object0, v);
        if(list0.isEmpty()) {
            if(list0 instanceof zzgsi) {
                list0 = new zzgsh(v1);
            }
            else if(!(list0 instanceof zzgth) || !(list0 instanceof zzgrz)) {
                list0 = new ArrayList(v1);
            }
            else {
                list0 = ((zzgrz)list0).zzd(v1);
            }
            zzguu.zzv(object0, v, list0);
            return list0;
        }
        Class class0 = list0.getClass();
        if(zzgsk.zza.isAssignableFrom(class0)) {
            arrayList0 = new ArrayList(list0.size() + v1);
            arrayList0.addAll(list0);
            zzguu.zzv(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzgup) {
            arrayList0 = new zzgsh(list0.size() + v1);
            ((zzgps)arrayList0).addAll(((zzgsh)arrayList0).size(), ((zzgup)list0));
            zzguu.zzv(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzgth && list0 instanceof zzgrz && !((zzgrz)list0).zzc()) {
            List list1 = ((zzgrz)list0).zzd(list0.size() + v1);
            zzguu.zzv(object0, v, list1);
            return list1;
        }
        return list0;
    }
}

