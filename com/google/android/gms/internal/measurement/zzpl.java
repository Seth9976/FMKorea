package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzpl implements k {
    private static zzpl zza;
    private final k zzb;

    static {
        zzpl.zza = new zzpl();
    }

    public zzpl() {
        this.zzb = l.b(new zzpn());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzpk)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzpk)zzpl.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpk)zzpl.zza.get()).zzb();
    }
}

