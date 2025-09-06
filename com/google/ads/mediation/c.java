package com.google.ads.mediation;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class c extends InterstitialAdLoadCallback {
    final AbstractAdViewAdapter a;
    final MediationInterstitialListener b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter0, MediationInterstitialListener mediationInterstitialListener0) {
        this.a = abstractAdViewAdapter0;
        this.b = mediationInterstitialListener0;
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.b.onAdFailedToLoad(this.a, loadAdError0);
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object object0) {
        this.a.mInterstitialAd = (InterstitialAd)object0;
        ((InterstitialAd)object0).setFullScreenContentCallback(new d(this.a, this.b));
        this.b.onAdLoaded(this.a);
    }
}

