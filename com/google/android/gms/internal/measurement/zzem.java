package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzem extends zza {
    private final zzb zzc;
    private final zzdf zzd;

    zzem(zzdf zzdf0, zzb zzdf$zzb0) {
        this.zzd = zzdf0;
        this.zzc = zzdf$zzb0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).unregisterOnMeasurementEventListener(this.zzc);
    }
}

