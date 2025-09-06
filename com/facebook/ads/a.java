package com.facebook.ads;

public abstract class a {
    public static LoadAdConfig a(AdViewLoadConfigBuilder adView$AdViewLoadConfigBuilder0) {
        return adView$AdViewLoadConfigBuilder0.build();
    }

    public static LoadConfigBuilder b(AdViewLoadConfigBuilder adView$AdViewLoadConfigBuilder0, String s) {
        return adView$AdViewLoadConfigBuilder0.withBid(s);
    }
}

