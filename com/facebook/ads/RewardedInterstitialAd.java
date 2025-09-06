package com.facebook.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class RewardedInterstitialAd implements FullScreenAd {
    @Keep
    public interface RewardedInterstitialAdLoadConfigBuilder extends LoadConfigBuilder {
        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialAdLoadConfigBuilder withAdListener(RewardedInterstitialAdListener arg1);

        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialAdLoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialAdLoadConfigBuilder withRewardData(RewardData arg1);
    }

    @Keep
    public interface RewardedInterstitialAdShowConfigBuilder extends ShowConfigBuilder {
        @Override  // com.facebook.ads.FullScreenAd$ShowConfigBuilder
        ShowAdConfig build();

        RewardedInterstitialShowAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedInterstitialAdShowConfigBuilder withAppOrientation(int arg1);
    }

    @Keep
    public interface RewardedInterstitialLoadAdConfig extends LoadAdConfig {
    }

    @Keep
    public interface RewardedInterstitialShowAdConfig extends ShowAdConfig {
    }

    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedInterstitialAdApi mRewardedInterstitialAdApi;

    @Benchmark
    public RewardedInterstitialAd(Context context0, String s) {
        this.mRewardedInterstitialAdApi = DynamicLoaderFactory.makeLoader(context0).createRewardedInterstitialAd(context0, s, this);
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public LoadConfigBuilder buildLoadAdConfig() {
        return this.buildLoadAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedInterstitialAdApi.buildLoadAdConfig();
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public ShowConfigBuilder buildShowAdConfig() {
        return this.buildShowAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedInterstitialAdApi.buildShowAdConfig();
    }

    @Override  // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedInterstitialAdApi.destroy();
    }

    @Override  // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mRewardedInterstitialAdApi.getPlacementId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public int getVideoDuration() {
        return this.mRewardedInterstitialAdApi.getVideoDuration();
    }

    @Override  // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedInterstitialAdApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mRewardedInterstitialAdApi.isAdLoaded();
    }

    @Override  // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedInterstitialAdApi.loadAd();
    }

    @Benchmark
    public void loadAd(RewardedInterstitialLoadAdConfig rewardedInterstitialAd$RewardedInterstitialLoadAdConfig0) {
        this.mRewardedInterstitialAdApi.loadAd(rewardedInterstitialAd$RewardedInterstitialLoadAdConfig0);
    }

    @Override  // com.facebook.ads.Ad
    @SuppressLint({"DeprecatedMethod"})
    @Deprecated
    public void setExtraHints(ExtraHints extraHints0) {
        this.mRewardedInterstitialAdApi.setExtraHints(extraHints0);
    }

    @Override  // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedInterstitialAdApi.show();
    }

    @Benchmark
    public boolean show(RewardedInterstitialShowAdConfig rewardedInterstitialAd$RewardedInterstitialShowAdConfig0) {
        return this.mRewardedInterstitialAdApi.show(rewardedInterstitialAd$RewardedInterstitialShowAdConfig0);
    }
}

