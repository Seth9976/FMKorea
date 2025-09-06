package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;

@Keep
public interface AudienceNetworkAdsApi {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 2;
    public static final int NATIVE = 4;
    public static final int NATIVE_BANNER = 5;
    public static final int REWARDED_VIDEO = 6;
    public static final int UNKNOWN;

    int getAdFormatForPlacement(String arg1);

    void initialize(Context arg1, MultithreadedBundleWrapper arg2, InitListener arg3);

    boolean isInitialized();

    void onContentProviderCreated(Context arg1);
}

