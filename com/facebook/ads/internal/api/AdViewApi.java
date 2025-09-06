package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdView.AdViewLoadConfig;
import com.facebook.ads.AdView.AdViewLoadConfigBuilder;
import com.facebook.ads.ExtraHints;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
public interface AdViewApi extends Ad, AdViewParentApi {
    AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(AdViewLoadConfig arg1);

    @Override  // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(Configuration arg1);

    @Override  // com.facebook.ads.Ad
    @Deprecated
    void setExtraHints(ExtraHints arg1);
}

