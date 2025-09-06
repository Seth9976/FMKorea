package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class zzjp implements zznf {
    private final zziq zza;

    zzjp(zziq zziq0) {
        this.zza = zziq0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zznf
    public final void zza(String s, String s1, Bundle bundle0) {
        if(!TextUtils.isEmpty(s)) {
            this.zza.zza("auto", s1, bundle0, s);
            return;
        }
        this.zza.zzb("auto", s1, bundle0);
    }
}

