package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzeb extends zza {
    private final Bundle zzc;
    private final zzcs zzd;
    private final zzdf zze;

    zzeb(zzdf zzdf0, Bundle bundle0, zzcs zzcs0) {
        this.zze = zzdf0;
        this.zzc = bundle0;
        this.zzd = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zze.zzj)).performAction(this.zzc, this.zzd, this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    protected final void zzb() {
        this.zzd.zza(null);
    }
}

