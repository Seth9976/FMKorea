package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzkx {
    private static final zzkx zza;
    private final zzle zzb;
    private final ConcurrentMap zzc;

    static {
        zzkx.zza = new zzkx();
    }

    private zzkx() {
        this.zzc = new ConcurrentHashMap();
        this.zzb = new zzjx();
    }

    public static zzkx zza() {
        return zzkx.zza;
    }

    public final zzlb zza(Class class0) {
        zziz.zza(class0, "messageType");
        zzlb zzlb0 = (zzlb)this.zzc.get(class0);
        if(zzlb0 == null) {
            zzlb0 = this.zzb.zza(class0);
            zziz.zza(class0, "messageType");
            zziz.zza(zzlb0, "schema");
            zzlb zzlb1 = (zzlb)this.zzc.putIfAbsent(class0, zzlb0);
            return zzlb1 == null ? zzlb0 : zzlb1;
        }
        return zzlb0;
    }

    public final zzlb zza(Object object0) {
        return this.zza(object0.getClass());
    }
}

