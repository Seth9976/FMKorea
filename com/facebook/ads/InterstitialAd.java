package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.EnumSet;

@Keep
public class InterstitialAd implements FullScreenAd {
    @Keep
    public interface InterstitialAdLoadConfigBuilder extends LoadConfigBuilder {
        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withAdCompanionView(boolean arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withAdListener(InterstitialAdListener arg1);

        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        LoadConfigBuilder withBid(String arg1);

        InterstitialAdLoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withCacheFlags(EnumSet arg1);

        InterstitialAdLoadConfigBuilder withRewardData(RewardData arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withRewardedAdListener(RewardedAdListener arg1);
    }

    @Keep
    public interface InterstitialAdShowConfigBuilder extends ShowConfigBuilder {
        @Override  // com.facebook.ads.FullScreenAd$ShowConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        ShowAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialShowAdConfig build();
    }

    @Keep
    public interface InterstitialLoadAdConfig extends LoadAdConfig {
    }

    @Keep
    public interface InterstitialShowAdConfig extends ShowAdConfig {
    }

    private final InterstitialAdApi mInterstitialAdApi;

    @Benchmark
    public InterstitialAd(Context context0, String s) {
        this.mInterstitialAdApi = DynamicLoaderFactory.makeLoader(context0).createInterstitialAd(context0, s, this);
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public LoadConfigBuilder buildLoadAdConfig() {
        return this.buildLoadAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mInterstitialAdApi.buildLoadAdConfig();
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public ShowConfigBuilder buildShowAdConfig() {
        return this.buildShowAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mInterstitialAdApi.buildShowAdConfig();
    }

    @Override  // com.facebook.ads.Ad
    public void destroy() {
        this.mInterstitialAdApi.destroy();
    }

    @Override  // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mInterstitialAdApi.getPlacementId();
    }

    @Override  // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mInterstitialAdApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mInterstitialAdApi.isAdLoaded();
    }

    @Override  // com.facebook.ads.Ad
    public void loadAd() {
        this.mInterstitialAdApi.loadAd();
    }

    public void loadAd(InterstitialLoadAdConfig interstitialAd$InterstitialLoadAdConfig0) {
        this.mInterstitialAdApi.loadAd(interstitialAd$InterstitialLoadAdConfig0);
    }

    public void registerAdCompanionView(AdCompanionView adCompanionView0) {
        Preconditions.checkIsOnMainThread();
        this.mInterstitialAdApi.registerAdCompanionView(adCompanionView0);
    }

    @Override  // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints0) {
        this.mInterstitialAdApi.setExtraHints(extraHints0);
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark
    public boolean show() {
        return this.mInterstitialAdApi.show();
    }

    @Benchmark
    public boolean show(InterstitialShowAdConfig interstitialAd$InterstitialShowAdConfig0) {
        return this.mInterstitialAdApi.show(interstitialAd$InterstitialShowAdConfig0);
    }

    public void unregisterAdCompanionView() {
        Preconditions.checkIsOnMainThread();
        this.mInterstitialAdApi.unregisterAdCompanionView();
    }
}

