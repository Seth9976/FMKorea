package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder;
import com.facebook.ads.InterstitialAd.InterstitialAdShowConfigBuilder;
import com.facebook.ads.InterstitialAd.InterstitialLoadAdConfig;
import com.facebook.ads.InterstitialAd.InterstitialShowAdConfig;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
public interface InterstitialAdApi extends FullScreenAd {
    @Override  // com.facebook.ads.FullScreenAd
    LoadConfigBuilder buildLoadAdConfig();

    InterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override  // com.facebook.ads.FullScreenAd
    ShowConfigBuilder buildShowAdConfig();

    InterstitialAdShowConfigBuilder buildShowAdConfig();

    boolean isAdLoaded();

    void loadAd(InterstitialLoadAdConfig arg1);

    void registerAdCompanionView(AdCompanionView arg1);

    @Override  // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints arg1);

    @Override  // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(InterstitialShowAdConfig arg1);

    void unregisterAdCompanionView();
}

