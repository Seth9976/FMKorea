package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.zzt;

public final class zzeps implements zzesj {
    private final zzfyo zza;
    private final zzdue zzb;

    zzeps(zzfyo zzfyo0, zzdue zzdue0) {
        this.zza = zzfyo0;
        this.zzb = zzdue0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 23;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzepr zzepr0 = () -> new zzept(this.zzb.zzc(), this.zzb.zzq(), zzt.zzs().zzl(), this.zzb.zzo(), this.zzb.zzr());
        return this.zza.zzb(zzepr0);
    }

    // 检测为 Lambda 实现
    final zzept zzc() [...]
}

