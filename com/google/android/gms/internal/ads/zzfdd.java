package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

public final class zzfdd implements zzgyt {
    private final zzfdc zza;

    public zzfdd(zzfdc zzfdc0) {
        this.zza = zzfdc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Clock clock0 = DefaultClock.getInstance();
        zzgzb.zzb(clock0);
        return clock0;
    }
}

