package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzen extends zza {
    private final String zzc;
    private final String zzd;
    private final Object zze;
    private final boolean zzf;
    private final zzdf zzg;

    zzen(zzdf zzdf0, String s, String s1, Object object0, boolean z) {
        this.zzg = zzdf0;
        this.zzc = s;
        this.zzd = s1;
        this.zze = object0;
        this.zzf = z;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdf$zza
    final void zza() {
        Object object0 = Preconditions.checkNotNull(this.zzg.zzj);
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zze);
        ((zzcu)object0).setUserProperty(this.zzc, this.zzd, iObjectWrapper0, this.zzf, this.zza);
    }
}

