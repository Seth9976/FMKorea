package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.ArrayList;
import java.util.Set;

final class zzemt implements zzesj {
    private final Set zza;

    zzemt(Set set0) {
        this.zza = set0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 8;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zza) {
            arrayList0.add(((String)object0));
        }
        return zzfye.zzh(new zzems(arrayList0));
    }
}

