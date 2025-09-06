package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class AdView extends RelativeLayout implements Ad {
    @Keep
    public interface AdViewLoadConfig extends LoadAdConfig {
    }

    @Keep
    public interface AdViewLoadConfigBuilder extends LoadConfigBuilder {
        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withAdListener(AdListener arg1);

        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withBid(String arg1);
    }

    class a implements AdViewParentApi {
        final AdView f;

        @Override  // com.facebook.ads.internal.api.AdViewParentApi
        public void onConfigurationChanged(Configuration configuration0) {
            AdView.this.super.onConfigurationChanged(configuration0);
        }
    }

    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    @Benchmark
    public AdView(Context context0, String s, AdSize adSize0) {
        super(context0);
        a adView$a0 = new a(this);
        this.mAdViewParentApi = adView$a0;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context0).createAdViewApi(context0, s, adSize0, adView$a0, this);
    }

    @Benchmark
    public AdView(Context context0, String s, String s1) {
        super(context0);
        a adView$a0 = new a(this);
        this.mAdViewParentApi = adView$a0;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context0).createAdViewApi(context0, s, s1, adView$a0, this);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override  // com.facebook.ads.Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override  // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override  // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override  // com.facebook.ads.Ad
    @Benchmark
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Benchmark
    public void loadAd(AdViewLoadConfig adView$AdViewLoadConfig0) {
        this.mAdViewApi.loadAd(adView$AdViewLoadConfig0);
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        this.mAdViewApi.onConfigurationChanged(configuration0);
    }

    @Override  // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints0) {
        this.mAdViewApi.setExtraHints(extraHints0);
    }
}

