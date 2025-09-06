package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.common.util.Clock;

final class zzeoi {
    public final d zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(d d0, long v, Clock clock0) {
        this.zza = d0;
        this.zzc = clock0;
        this.zzb = clock0.elapsedRealtime() + v;
    }

    public final boolean zza() {
        long v = this.zzc.elapsedRealtime();
        return this.zzb < v;
    }
}

