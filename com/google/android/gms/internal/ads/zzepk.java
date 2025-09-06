package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

public final class zzepk implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;

    zzepk(zzfyo zzfyo0, zzfca zzfca0) {
        this.zza = zzfyo0;
        this.zzb = zzfca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 21;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzepj zzepj0 = () -> new zzepl("requester_type_2".equals(zzf.zzb(this.zzb.zzd)));
        return this.zza.zzb(zzepj0);
    }

    // 检测为 Lambda 实现
    final zzepl zzc() [...]
}

