package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class NativeAdsManager {
    @Keep
    public interface Listener {
        void onAdError(AdError arg1);

        void onAdsLoaded();
    }

    private final NativeAdsManagerApi mNativeAdsManagerApi;

    public NativeAdsManager(Context context0, String s, int v) {
        Preconditions.checkNotNull(context0, "Context can not be null");
        Preconditions.checkIsTrue(v > -1, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdsManagerApi(context0, s, v);
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    public void loadAds(MediaCacheFlag nativeAdBase$MediaCacheFlag0) {
        this.mNativeAdsManagerApi.loadAds(nativeAdBase$MediaCacheFlag0);
    }

    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public NativeAd nextNativeAd(NativeAdListener nativeAdListener0) {
        return this.mNativeAdsManagerApi.nextNativeAd(nativeAdListener0);
    }

    public void setExtraHints(String s) {
        this.mNativeAdsManagerApi.setExtraHints(s);
    }

    public void setListener(Listener nativeAdsManager$Listener0) {
        this.mNativeAdsManagerApi.setListener(nativeAdsManager$Listener0);
    }
}

