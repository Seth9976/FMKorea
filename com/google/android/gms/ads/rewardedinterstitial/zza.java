package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbwq;

public final class zza implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final RewardedInterstitialAdLoadCallback zzd;

    public zza(Context context0, String s, AdRequest adRequest0, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = rewardedInterstitialAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbwq(context0, this.zzb).zza(this.zzc.zza(), this.zzd);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbtf.zza(context0).zzf(illegalStateException0, "RewardedInterstitialAd.load");
        }
    }
}

