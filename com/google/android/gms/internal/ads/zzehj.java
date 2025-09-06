package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzehj {
    private zzehc zza;

    zzehj() {
    }

    private zzehj(zzehc zzehc0) {
        this.zza = zzehc0;
    }

    public final zzehc zza(Clock clock0, zzehd zzehd0, zzeds zzeds0, zzfik zzfik0) {
        zzehc zzehc0 = this.zza;
        return zzehc0 == null ? new zzehc(clock0, zzehd0, zzeds0, zzfik0) : zzehc0;
    }

    public static zzehj zzb(zzehc zzehc0) {
        return new zzehj(zzehc0);
    }
}

