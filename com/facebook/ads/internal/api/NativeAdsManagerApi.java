package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase.MediaCacheFlag;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager.Listener;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
public interface NativeAdsManagerApi {
    void disableAutoRefresh();

    int getUniqueNativeAdCount();

    boolean isLoaded();

    void loadAds();

    void loadAds(MediaCacheFlag arg1);

    NativeAd nextNativeAd();

    NativeAd nextNativeAd(NativeAdListener arg1);

    void setExtraHints(String arg1);

    void setListener(Listener arg1);
}

