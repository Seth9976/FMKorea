package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzdq extends zza {
    private final Bundle zzc;
    private final zzdf zzd;

    zzdq(zzdf zzdf0, Bundle bundle0) {
        this.zzd = zzdf0;
        this.zzc = bundle0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        ((zzcu)Preconditions.checkNotNull(this.zzd.zzj)).setConsentThirdParty(this.zzc, this.zza);
    }
}

