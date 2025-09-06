package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzeh extends zza {
    private final boolean zzc;
    private final zzdf zzd;

    zzeh(zzdf zzdf0, boolean z) {
        this.zzd = zzdf0;
        this.zzc = z;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).setDataCollectionEnabled(this.zzc);
    }
}

