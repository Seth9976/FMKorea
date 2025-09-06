package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder;
import com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder;
import com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialLoadAdConfig;
import com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialShowAdConfig;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
public interface RewardedInterstitialAdApi extends FullScreenAd {
    @Override  // com.facebook.ads.FullScreenAd
    LoadConfigBuilder buildLoadAdConfig();

    RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override  // com.facebook.ads.FullScreenAd
    ShowConfigBuilder buildShowAdConfig();

    RewardedInterstitialAdShowConfigBuilder buildShowAdConfig();

    @Override  // com.facebook.ads.Ad
    void destroy();

    @Override  // com.facebook.ads.Ad
    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override  // com.facebook.ads.Ad
    void loadAd();

    void loadAd(RewardedInterstitialLoadAdConfig arg1);

    void registerAdCompanionView(AdCompanionView arg1);

    @Override  // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints arg1);

    @Override  // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(RewardedInterstitialShowAdConfig arg1);

    void unregisterAdCompanionView();
}

