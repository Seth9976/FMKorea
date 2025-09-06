package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzds extends zza {
    private final long zzc;
    private final zzdf zzd;

    zzds(zzdf zzdf0, long v) {
        this.zzd = zzdf0;
        this.zzc = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).setSessionTimeoutDuration(this.zzc);
    }
}

