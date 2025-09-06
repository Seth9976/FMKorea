package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Keep
public final class AudienceNetworkAds {
    @Keep
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdFormat {
        public static final int BANNER = 1;
        public static final int INTERSTITIAL = 2;
        public static final int NATIVE = 4;
        public static final int NATIVE_BANNER = 5;
        public static final int REWARDED_VIDEO = 6;
        public static final int UNKNOWN;

    }

    @Keep
    public interface InitListener {
        void onInitialized(InitResult arg1);
    }

    @Keep
    public interface InitResult {
        String getMessage();

        boolean isSuccess();
    }

    @Keep
    public interface InitSettingsBuilder {
        void initialize();

        InitSettingsBuilder withInitListener(InitListener arg1);

        InitSettingsBuilder withMediationService(String arg1);

        InitSettingsBuilder withPlacementIds(List arg1);
    }

    public static final String TAG = "FBAudienceNetwork";

    public static InitSettingsBuilder buildInitSettings(Context context0) {
        Preconditions.checkNotNull(context0, "Context can not be null.");
        return new com.facebook.ads.internal.api.InitSettingsBuilder(context0);
    }

    public static int getAdFormatForPlacement(Context context0, String s) {
        return DynamicLoaderFactory.makeLoader(context0).createAudienceNetworkAdsApi().getAdFormatForPlacement(s);
    }

    public static void initialize(Context context0) {
        Preconditions.checkNotNull(context0, "Context can not be null.");
        DynamicLoaderFactory.initialize(context0, null, null, false);
    }

    public static boolean isInitialized(Context context0) {
        return DynamicLoaderFactory.getDynamicLoader() == null ? false : DynamicLoaderFactory.makeLoader(context0).createAudienceNetworkAdsApi().isInitialized();
    }
}

