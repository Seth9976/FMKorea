package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

@Deprecated
public interface MediationInterstitialListener {
    void onAdClicked(MediationInterstitialAdapter arg1);

    void onAdClosed(MediationInterstitialAdapter arg1);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter arg1, int arg2);

    void onAdFailedToLoad(MediationInterstitialAdapter arg1, AdError arg2);

    void onAdLeftApplication(MediationInterstitialAdapter arg1);

    void onAdLoaded(MediationInterstitialAdapter arg1);

    void onAdOpened(MediationInterstitialAdapter arg1);
}

