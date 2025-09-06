package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.ArrayList;
import java.util.List;

@Keep
public class InitSettingsBuilder implements com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder {
    public static final String PLACEMENTS_KEY = "PLACEMENTS_KEY";
    private final Context mContext;
    private final MultithreadedBundleWrapper mInitSettings;
    private InitListener mInitializationListener;

    public InitSettingsBuilder(Context context0) {
        this.mInitSettings = new MultithreadedBundleWrapper();
        this.mContext = context0;
    }

    @Override  // com.facebook.ads.AudienceNetworkAds$InitSettingsBuilder
    public void initialize() {
        DynamicLoaderFactory.initialize(this.mContext, this.mInitSettings, this.mInitializationListener, false);
    }

    @Override  // com.facebook.ads.AudienceNetworkAds$InitSettingsBuilder
    public com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withInitListener(InitListener audienceNetworkAds$InitListener0) {
        return this.withInitListener(audienceNetworkAds$InitListener0);
    }

    public InitSettingsBuilder withInitListener(InitListener audienceNetworkAds$InitListener0) {
        this.mInitializationListener = audienceNetworkAds$InitListener0;
        return this;
    }

    @Override  // com.facebook.ads.AudienceNetworkAds$InitSettingsBuilder
    public com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withMediationService(String s) {
        return this.withMediationService(s);
    }

    public InitSettingsBuilder withMediationService(String s) {
        AdSettings.setMediationService(s);
        return this;
    }

    @Override  // com.facebook.ads.AudienceNetworkAds$InitSettingsBuilder
    public com.facebook.ads.AudienceNetworkAds.InitSettingsBuilder withPlacementIds(List list0) {
        return this.withPlacementIds(list0);
    }

    public InitSettingsBuilder withPlacementIds(List list0) {
        ArrayList arrayList0 = new ArrayList(list0);
        this.mInitSettings.putStringArrayList("PLACEMENTS_KEY", arrayList0);
        return this;
    }
}

