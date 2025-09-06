package com.google.android.gms.ads.mediation;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import java.util.List;

public abstract class Adapter implements MediationExtrasReceiver {
    public abstract VersionInfo getSDKVersionInfo();

    public abstract VersionInfo getVersionInfo();

    public abstract void initialize(Context arg1, InitializationCompleteCallback arg2, List arg3);

    public void loadAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support app open ads.", "com.google.android.gms.ads"));
    }

    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support banner ads.", "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interscroller ads.", "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support interstitial ads.", "com.google.android.gms.ads"));
    }

    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support native ads.", "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support rewarded ads.", "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration0, MediationAdLoadCallback mediationAdLoadCallback0) {
        mediationAdLoadCallback0.onFailure(new AdError(7, this.getClass().getSimpleName() + " does not support rewarded interstitial ads.", "com.google.android.gms.ads"));
    }
}

