package com.google.android.gms.internal.measurement;

import X1.k;
import X1.l;

public final class zzon implements k {
    private static zzon zza;
    private final k zzb;

    static {
        zzon.zza = new zzon();
    }

    public zzon() {
        this.zzb = l.b(new zzop());
    }

    @Override  // X1.k
    public final Object get() {
        return (zzom)this.zzb.get();
    }

    public static boolean zza() {
        return ((zzom)zzon.zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzom)zzon.zza.get()).zzb();
    }
}

