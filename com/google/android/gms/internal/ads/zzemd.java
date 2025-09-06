package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.common.util.Clock;

public final class zzemd implements zzesj {
    private final Clock zza;
    private final zzfca zzb;

    zzemd(Clock clock0, zzfca zzfca0) {
        this.zza = clock0;
        this.zzb = zzfca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 4;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        long v = this.zza.currentTimeMillis();
        return zzfye.zzh(new zzeme(this.zzb, v));
    }
}

