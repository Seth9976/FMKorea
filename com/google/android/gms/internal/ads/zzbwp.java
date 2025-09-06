package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public final class zzbwp extends zzbwc {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwq zzb;

    public zzbwp(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0, zzbwq zzbwq0) {
        this.zza = rewardedInterstitialAdLoadCallback0;
        this.zzb = zzbwq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwd
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(zze zze0) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.zza;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            rewardedInterstitialAdLoadCallback0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwd
    public final void zzg() {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0 = this.zza;
        if(rewardedInterstitialAdLoadCallback0 != null) {
            zzbwq zzbwq0 = this.zzb;
            if(zzbwq0 != null) {
                rewardedInterstitialAdLoadCallback0.onAdLoaded(zzbwq0);
            }
        }
    }
}

