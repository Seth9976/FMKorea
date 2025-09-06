package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzdj extends zza {
    private final String zzc;
    private final String zzd;
    private final zzcs zze;
    private final zzdf zzf;

    zzdj(zzdf zzdf0, String s, String s1, zzcs zzcs0) {
        this.zzf = zzdf0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzf.zzj)).getConditionalUserProperties(this.zzc, this.zzd, this.zze);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zze.zza(null);
    }
}

