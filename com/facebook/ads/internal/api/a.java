package com.facebook.ads.internal.api;

import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;

public abstract class a {
    public static LoadConfigBuilder a(InterstitialAdApi interstitialAdApi0) {
        return interstitialAdApi0.buildLoadAdConfig();
    }

    public static ShowConfigBuilder b(InterstitialAdApi interstitialAdApi0) {
        return interstitialAdApi0.buildShowAdConfig();
    }
}

