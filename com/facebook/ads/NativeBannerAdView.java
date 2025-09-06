package com.facebook.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class NativeBannerAdView {
    @Keep
    public static enum Type {
        HEIGHT_50(4),
        HEIGHT_100(0),
        HEIGHT_120(1);

        private final int mEnumCode;
        private NativeAdViewTypeApi mNativeAdViewTypeApi;

        private Type(int v1) {
            this.mEnumCode = v1;
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        public int getHeight() {
            return this.getNativeAdViewTypeApi().getHeight();
        }

        private NativeAdViewTypeApi getNativeAdViewTypeApi() {
            if(this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(this.mEnumCode);
            }
            return this.mNativeAdViewTypeApi;
        }

        public int getValue() {
            return this.getNativeAdViewTypeApi().getValue();
        }

        public int getWidth() {
            return this.getNativeAdViewTypeApi().getWidth();
        }
    }

    public static View render(Context context0, NativeBannerAd nativeBannerAd0, Type nativeBannerAdView$Type0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd0, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(nativeBannerAdView$Type0, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeBannerAdViewApi().render(context0, nativeBannerAd0, nativeBannerAdView$Type0, null);
    }

    public static View render(Context context0, NativeBannerAd nativeBannerAd0, Type nativeBannerAdView$Type0, NativeAdViewAttributes nativeAdViewAttributes0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeBannerAd0, "nativeBannerAd must be not null");
        Preconditions.checkNotNull(nativeBannerAdView$Type0, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeBannerAdViewApi().render(context0, nativeBannerAd0, nativeBannerAdView$Type0, nativeAdViewAttributes0);
    }
}

