package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzee extends zza {
    private final zzc zzc;
    private final zzdf zzd;

    zzee(zzdf zzdf0, zzc zzdf$zzc0) {
        this.zzd = zzdf0;
        this.zzc = zzdf$zzc0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).setEventInterceptor(this.zzc);
    }
}

