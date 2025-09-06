package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.Ad.LoadConfigBuilder;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd.ShowConfigBuilder;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder;
import com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder;
import com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig;
import com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
public interface RewardedVideoAdApi extends FullScreenAd {
    @Override  // com.facebook.ads.FullScreenAd
    LoadConfigBuilder buildLoadAdConfig();

    RewardedVideoAdLoadConfigBuilder buildLoadAdConfig();

    @Override  // com.facebook.ads.FullScreenAd
    ShowConfigBuilder buildShowAdConfig();

    RewardedVideoAdShowConfigBuilder buildShowAdConfig();

    @Override  // com.facebook.ads.Ad
    void destroy();

    @Override  // com.facebook.ads.Ad
    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override  // com.facebook.ads.Ad
    void loadAd();

    void loadAd(RewardedVideoLoadAdConfig arg1);

    void registerAdCompanionView(AdCompanionView arg1);

    @Override  // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints arg1);

    @Override  // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(RewardedVideoShowAdConfig arg1);

    void unregisterAdCompanionView();
}

