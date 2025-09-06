package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzdz extends zza {
    private final String zzc;
    private final String zzd;
    private final boolean zze;
    private final zzcs zzf;
    private final zzdf zzg;

    zzdz(zzdf zzdf0, String s, String s1, boolean z, zzcs zzcs0) {
        this.zzg = zzdf0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = z;
        this.zzf = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzg.zzj)).getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zzf.zza(null);
    }
}

