package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeu extends zza {
    private final Activity zzc;
    private final zzcs zzd;
    private final zzd zze;

    zzeu(zzd zzdf$zzd0, Activity activity0, zzcs zzcs0) {
        this.zze = zzdf$zzd0;
        this.zzc = activity0;
        this.zzd = zzcs0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(zzdf.this.zzj)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}

