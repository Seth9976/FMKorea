package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeq extends zza {
    private final Activity zzc;
    private final zzd zzd;

    zzeq(zzd zzdf$zzd0, Activity activity0) {
        this.zzd = zzdf$zzd0;
        this.zzc = activity0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(zzdf.this.zzj)).onActivityStarted(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}

