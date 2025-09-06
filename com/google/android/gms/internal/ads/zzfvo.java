package com.google.android.gms.internal.ads;

import java.util.AbstractMap.SimpleImmutableEntry;

final class zzfvo extends zzfud {
    final zzfvp zza;

    zzfvo(zzfvp zzfvp0) {
        this.zza = zzfvp0;
        super();
    }

    @Override
    public final Object get(int v) {
        zzfri.zza(v, zzfvp.zzs(this.zza), "index");
        int v1 = v + v;
        Object object0 = zzfvp.zzt(this.zza)[v1];
        object0.getClass();
        Object object1 = zzfvp.zzt(this.zza)[v1 + 1];
        object1.getClass();
        return new AbstractMap.SimpleImmutableEntry(object0, object1);
    }

    @Override
    public final int size() {
        return zzfvp.zzs(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfty
    public final boolean zzf() {
        return true;
    }
}

