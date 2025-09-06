package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class zzmi {
    private final Clock zza;
    private long zzb;

    public zzmi(Clock clock0) {
        Preconditions.checkNotNull(clock0);
        this.zza = clock0;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final boolean zza(long v) {
        return Long.compare(this.zzb, 0L) == 0 ? true : this.zza.elapsedRealtime() - this.zzb >= 3600000L;
    }

    public final void zzb() {
        this.zzb = this.zza.elapsedRealtime();
    }
}

