package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzdl extends zza {
    private final Activity zzc;
    private final String zzd;
    private final String zze;
    private final zzdf zzf;

    zzdl(zzdf zzdf0, Activity activity0, String s, String s1) {
        this.zzf = zzdf0;
        this.zzc = activity0;
        this.zzd = s;
        this.zze = s1;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzf.zzj)).setCurrentScreen(ObjectWrapper.wrap(this.zzc), this.zzd, this.zze, this.zza);
    }
}

