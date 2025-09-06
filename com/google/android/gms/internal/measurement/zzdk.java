package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzdk extends zza {
    private final String zzc;
    private final String zzd;
    private final Bundle zze;
    private final zzdf zzf;

    zzdk(zzdf zzdf0, String s, String s1, Bundle bundle0) {
        this.zzf = zzdf0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = bundle0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzf.zzj)).clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}

