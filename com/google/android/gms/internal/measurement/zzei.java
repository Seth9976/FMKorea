package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzei extends zza {
    private final zzcs zzc;
    private final int zzd;
    private final zzdf zze;

    zzei(zzdf zzdf0, zzcs zzcs0, int v) {
        this.zze = zzdf0;
        this.zzc = zzcs0;
        this.zzd = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zze.zzj)).getTestFlag(this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zzc.zza(null);
    }
}

