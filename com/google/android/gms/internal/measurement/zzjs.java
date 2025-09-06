package com.google.android.gms.internal.measurement;

import java.util.List;

abstract class zzjs {
    private static final zzjs zza;
    private static final zzjs zzb;

    static {
        zzjs.zza = new zzjr(null);
        zzjs.zzb = new zzjt(null);
    }

    private zzjs() {
    }

    zzjs(zzjv zzjv0) {
    }

    static zzjs zza() {
        return zzjs.zza;
    }

    abstract List zza(Object arg1, long arg2);

    abstract void zza(Object arg1, Object arg2, long arg3);

    static zzjs zzb() {
        return zzjs.zzb;
    }

    abstract void zzb(Object arg1, long arg2);
}

