package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

public final class zzemh implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final zzfcn zzc;

    zzemh(zzfyo zzfyo0, zzfca zzfca0, zzfcn zzfcn0) {
        this.zza = zzfyo0;
        this.zzb = zzfca0;
        this.zzc = zzfcn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 5;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzemg zzemg0 = () -> // 去混淆评级： 低(20)
        new zzemi((!((Boolean)zzba.zzc().zzb(zzbbr.zzhb)).booleanValue() || !"requester_type_2".equals(zzf.zzb(this.zzb.zzd)) ? null : zzfcn.zza()));
        return this.zza.zzb(zzemg0);
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    final zzemi zzc() [...]
}

