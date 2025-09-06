package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

public abstract class RtbAdapter extends Adapter {
    public abstract void collectSignals(RtbSignalData arg1, SignalCallbacks arg2);

    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadAppOpenAd(mediationAppOpenAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadBannerAd(mediationBannerAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbInterscrollerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interscroller ads.", "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadInterstitialAd(mediationInterstitialAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadNativeAd(mediationNativeAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadRewardedAd(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
    }

    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        this.loadRewardedInterstitialAd(mediationRewardedAdConfiguration0, mediationAdLoadCallback0);
    }
}

