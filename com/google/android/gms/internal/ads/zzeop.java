package com.google.android.gms.internal.ads;

import Z1.d;

public final class zzeop implements zzesj {
    private final zzfyo zza;
    private final zzdph zzb;
    private final String zzc;
    private final zzfca zzd;

    public zzeop(zzfyo zzfyo0, zzdph zzdph0, zzfca zzfca0, String s) {
        this.zza = zzfyo0;
        this.zzb = zzdph0;
        this.zzd = zzfca0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 17;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeoo zzeoo0 = () -> new zzeoq(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
        return this.zza.zzb(zzeoo0);
    }

    // 检测为 Lambda 实现
    final zzeoq zzc() [...]
}

