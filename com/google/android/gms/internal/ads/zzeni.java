package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class zzeni implements zzesj {
    private final Executor zza;
    private final zzbzj zzb;

    zzeni(Executor executor0, zzbzj zzbzj0) {
        this.zza = executor0;
        this.zzb = zzbzj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 10;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzcx)).booleanValue() ? zzfye.zzh(null) : zzfye.zzm(this.zzb.zzj(), (Object object0) -> (((ArrayList)object0).isEmpty() ? null : new zzenh(((ArrayList)object0))), this.zza);
    }
}

