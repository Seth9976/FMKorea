package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzoo implements k {
    private static zzoo zza;
    private final k zzb;

    static {
        zzoo.zza = new zzoo();
    }

    public zzoo() {
        this.zzb = l.b(new zzoq());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzor)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzor)zzoo.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzor)zzoo.zza.get()).zzb();
    }
}

