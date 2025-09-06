package com.facebook.ads.internal.api;

import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;

public abstract class b {
    public static LoadConfigBuilder a(RewardedInterstitialAdApi rewardedInterstitialAdApi0) {
        return rewardedInterstitialAdApi0.buildLoadAdConfig();
    }

    public static ShowConfigBuilder b(RewardedInterstitialAdApi rewardedInterstitialAdApi0) {
        return rewardedInterstitialAdApi0.buildShowAdConfig();
    }
}

