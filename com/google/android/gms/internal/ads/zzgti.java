package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzgti {
    private static final zzgti zza;
    private final zzgtu zzb;
    private final ConcurrentMap zzc;

    static {
        zzgti.zza = new zzgti();
    }

    private zzgti() {
        this.zzc = new ConcurrentHashMap();
        this.zzb = new zzgss();
    }

    public static zzgti zza() {
        return zzgti.zza;
    }

    public final zzgtt zzb(Class class0) {
        zzgsa.zzc(class0, "messageType");
        zzgtt zzgtt0 = (zzgtt)this.zzc.get(class0);
        if(zzgtt0 == null) {
            zzgtt0 = this.zzb.zza(class0);
            zzgsa.zzc(class0, "messageType");
            zzgtt zzgtt1 = (zzgtt)this.zzc.putIfAbsent(class0, zzgtt0);
            return zzgtt1 == null ? zzgtt0 : zzgtt1;
        }
        return zzgtt0;
    }
}

