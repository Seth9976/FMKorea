package com.google.android.gms.internal.ads;

import java.util.List;

final class zzgsm extends zzgso {
    private zzgsm() {
        super(null);
    }

    zzgsm(zzgsl zzgsl0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final List zza(Object object0, long v) {
        List list0 = (zzgrz)zzguu.zzh(object0, v);
        if(!((zzgrz)list0).zzc()) {
            int v1 = list0.size();
            list0 = ((zzgrz)list0).zzd((v1 == 0 ? 10 : v1 + v1));
            zzguu.zzv(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final void zzb(Object object0, long v) {
        ((zzgrz)zzguu.zzh(object0, v)).zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzgso
    final void zzc(Object object0, Object object1, long v) {
        zzgrz zzgrz0 = (zzgrz)zzguu.zzh(object0, v);
        zzgrz zzgrz1 = (zzgrz)zzguu.zzh(object1, v);
        int v1 = zzgrz0.size();
        int v2 = zzgrz1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzgrz0.zzc()) {
                zzgrz0 = zzgrz0.zzd(v2 + v1);
            }
            zzgrz0.addAll(zzgrz1);
        }
        if(v1 > 0) {
            zzgrz1 = zzgrz0;
        }
        zzguu.zzv(object0, v, zzgrz1);
    }
}

