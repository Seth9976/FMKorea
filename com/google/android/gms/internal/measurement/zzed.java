package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzed extends zza {
    private final String zzc;
    private final zzcs zzd;
    private final zzdf zze;

    zzed(zzdf zzdf0, String s, zzcs zzcs0) {
        this.zze = zzdf0;
        this.zzc = s;
        this.zzd = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zze.zzj)).getMaxUserProperties(this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zzd.zza(null);
    }
}

