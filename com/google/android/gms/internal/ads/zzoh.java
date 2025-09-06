package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

public final class zzoh {
    public static final zzoh zza;
    private final zzog zzb;

    static {
        zzoh.zza = zzfk.zza >= 0x1F ? new zzoh(zzog.zza) : new zzoh();
    }

    public zzoh() {
        this.zzb = null;
        zzdy.zzf(zzfk.zza < 0x1F);
    }

    public zzoh(LogSessionId logSessionId0) {
        zzog zzog0 = new zzog(logSessionId0);
        super();
        this.zzb = zzog0;
    }

    private zzoh(zzog zzog0) {
        this.zzb = zzog0;
    }

    public final LogSessionId zza() {
        this.zzb.getClass();
        return this.zzb.zzb;
    }
}

