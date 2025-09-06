package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzeg extends zza {
    private final zzcs zzc;
    private final zzdf zzd;

    zzeg(zzdf zzdf0, zzcs zzcs0) {
        this.zzd = zzdf0;
        this.zzc = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).getAppInstanceId(this.zzc);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zzc.zza(null);
    }
}

