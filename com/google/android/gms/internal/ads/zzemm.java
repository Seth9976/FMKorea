package com.google.android.gms.internal.ads;

import Z1.d;
import java.util.concurrent.Executor;

public final class zzemm implements zzesj {
    private final d zza;
    private final Executor zzb;

    public zzemm(d d0, Executor executor0) {
        this.zza = d0;
        this.zzb = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 6;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return zzfye.zzn(this.zza, (/* 缺少Lambda参数 */) -> zzfye.zzh(new zzemk(((String)object0))), this.zzb);
    }
}

