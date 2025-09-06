package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzdp extends zza {
    private final zzdf zzc;

    zzdp(zzdf zzdf0) {
        this.zzc = zzdf0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzc.zzj)).resetAnalyticsData(this.zza);
    }
}

