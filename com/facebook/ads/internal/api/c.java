package com.facebook.ads.internal.api;

import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;

public abstract class c {
    public static LoadConfigBuilder a(RewardedVideoAdApi rewardedVideoAdApi0) {
        return rewardedVideoAdApi0.buildLoadAdConfig();
    }

    public static ShowConfigBuilder b(RewardedVideoAdApi rewardedVideoAdApi0) {
        return rewardedVideoAdApi0.buildShowAdConfig();
    }
}

