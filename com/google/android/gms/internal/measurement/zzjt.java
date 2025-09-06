package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzjt extends zzjs {
    private zzjt() {
        super(null);
    }

    zzjt(zzjw zzjw0) {
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final List zza(Object object0, long v) {
        List list0 = zzjt.zzc(object0, v);
        if(!((zzjf)list0).zzc()) {
            int v1 = list0.size();
            list0 = ((zzjf)list0).zza((v1 == 0 ? 10 : v1 << 1));
            zzmg.zza(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final void zza(Object object0, Object object1, long v) {
        zzjf zzjf0 = zzjt.zzc(object0, v);
        zzjf zzjf1 = zzjt.zzc(object1, v);
        int v1 = zzjf0.size();
        int v2 = zzjf1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzjf0.zzc()) {
                zzjf0 = zzjf0.zza(v2 + v1);
            }
            zzjf0.addAll(zzjf1);
        }
        if(v1 > 0) {
            zzjf1 = zzjf0;
        }
        zzmg.zza(object0, v, zzjf1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjs
    final void zzb(Object object0, long v) {
        zzjt.zzc(object0, v).i_();
    }

    private static zzjf zzc(Object object0, long v) {
        return (zzjf)zzmg.zze(object0, v);
    }
}

