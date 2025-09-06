package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class RewardedVideoAd implements FullScreenAd {
    @Keep
    public interface RewardedVideoAdLoadConfigBuilder extends LoadConfigBuilder {
        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdCompanionView(boolean arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener arg1);

        @Override  // com.facebook.ads.Ad$LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withBid(String arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean arg1);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withRewardData(RewardData arg1);
    }

    @Keep
    public interface RewardedVideoAdShowConfigBuilder extends ShowConfigBuilder {
        @Override  // com.facebook.ads.FullScreenAd$ShowConfigBuilder
        ShowAdConfig build();

        RewardedVideoShowAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdShowConfigBuilder withAppOrientation(int arg1);
    }

    @Keep
    public interface RewardedVideoLoadAdConfig extends LoadAdConfig {
    }

    @Keep
    public interface RewardedVideoShowAdConfig extends ShowAdConfig {
    }

    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedVideoAdApi mRewardedVideoAdApi;

    @Benchmark
    public RewardedVideoAd(Context context0, String s) {
        this.mRewardedVideoAdApi = DynamicLoaderFactory.makeLoader(context0).createRewardedVideoAd(context0, s, this);
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public LoadConfigBuilder buildLoadAdConfig() {
        return this.buildLoadAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedVideoAdApi.buildLoadAdConfig();
    }

    @Override  // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public ShowConfigBuilder buildShowAdConfig() {
        return this.buildShowAdConfig();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedVideoAdApi.buildShowAdConfig();
    }

    @Override  // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedVideoAdApi.destroy();
    }

    @Override  // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mRewardedVideoAdApi.getPlacementId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public int getVideoDuration() {
        return this.mRewardedVideoAdApi.getVideoDuration();
    }

    @Override  // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mRewardedVideoAdApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mRewardedVideoAdApi.isAdLoaded();
    }

    @Override  // com.facebook.ads.Ad
    public void loadAd() {
        this.mRewardedVideoAdApi.loadAd();
    }

    @Benchmark
    public void loadAd(RewardedVideoLoadAdConfig rewardedVideoAd$RewardedVideoLoadAdConfig0) {
        this.mRewardedVideoAdApi.loadAd(rewardedVideoAd$RewardedVideoLoadAdConfig0);
    }

    public void registerAdCompanionView(AdCompanionView adCompanionView0) {
        Preconditions.checkIsOnMainThread();
        this.mRewardedVideoAdApi.registerAdCompanionView(adCompanionView0);
    }

    @Override  // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints0) {
        this.mRewardedVideoAdApi.setExtraHints(extraHints0);
    }

    @Override  // com.facebook.ads.FullScreenAd
    public boolean show() {
        return this.mRewardedVideoAdApi.show();
    }

    @Benchmark
    public boolean show(RewardedVideoShowAdConfig rewardedVideoAd$RewardedVideoShowAdConfig0) {
        return this.mRewardedVideoAdApi.show(rewardedVideoAd$RewardedVideoShowAdConfig0);
    }

    public void unregisterAdCompanionView() {
        Preconditions.checkIsOnMainThread();
        this.mRewardedVideoAdApi.unregisterAdCompanionView();
    }
}

