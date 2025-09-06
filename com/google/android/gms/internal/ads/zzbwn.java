package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

public final class zzbwn extends zzbvs {
    private final String zza;
    private final int zzb;

    public zzbwn(RewardItem rewardItem0) {
        this((rewardItem0 == null ? "" : rewardItem0.getType()), (rewardItem0 == null ? 1 : rewardItem0.getAmount()));
    }

    public zzbwn(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final int zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final String zzf() {
        return this.zza;
    }
}

