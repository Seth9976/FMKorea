package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class zzfvb extends zzfvf {
    final Comparator zza;

    zzfvb(Comparator comparator0) {
        this.zza = comparator0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    final Map zza() {
        return new TreeMap(this.zza);
    }
}

