package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzdo extends zza {
    private final Boolean zzc;
    private final zzdf zzd;

    zzdo(zzdf zzdf0, Boolean boolean0) {
        this.zzd = zzdf0;
        this.zzc = boolean0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        if(this.zzc != null) {
            ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
            return;
        }
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).clearMeasurementEnabled(this.zza);
    }
}

