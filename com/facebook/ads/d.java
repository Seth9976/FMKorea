package com.facebook.ads;

public abstract class d {
    public static LoadAdConfig a(NativeAdLoadConfigBuilder nativeAdBase$NativeAdLoadConfigBuilder0) {
        return nativeAdBase$NativeAdLoadConfigBuilder0.build();
    }

    public static LoadConfigBuilder b(NativeAdLoadConfigBuilder nativeAdBase$NativeAdLoadConfigBuilder0, String s) {
        return nativeAdBase$NativeAdLoadConfigBuilder0.withBid(s);
    }
}

