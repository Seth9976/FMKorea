package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzdu extends zza {
    private final String zzc;
    private final zzdf zzd;

    zzdu(zzdf zzdf0, String s) {
        this.zzd = zzdf0;
        this.zzc = s;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).beginAdUnitExposure(this.zzc, this.zzb);
    }
}

