package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;

public final class zzeqn implements zzesj {
    private final zzfyo zza;
    private final Context zzb;
    private final Set zzc;

    public zzeqn(zzfyo zzfyo0, Context context0, Set set0) {
        this.zza = zzfyo0;
        this.zzb = context0;
        this.zzc = set0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 27;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeqm zzeqm0 = () -> // 去混淆评级： 中等(50)
        (!((Boolean)zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() || !this.zzc.contains("rewarded") && !this.zzc.contains("interstitial") && !this.zzc.contains("native") && !this.zzc.contains("banner") ? new zzeqo(null) : new zzeqo(zzt.zzA().zze(this.zzb)));
        return this.zza.zzb(zzeqm0);
    }

    // 去混淆评级： 中等(50)
    // 检测为 Lambda 实现
    final zzeqo zzc() [...]
}

