package com.facebook.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public class NativeAdView {
    @Keep
    @Deprecated
    public static enum Type {
        @Deprecated
        HEIGHT_300(2),
        @Deprecated
        HEIGHT_400(3);

        private final int mEnumCode;
        private NativeAdViewTypeApi mNativeAdViewTypeApi;

        @Deprecated
        private Type(int v1) {
            this.mEnumCode = v1;
        }

        public int getEnumCode() {
            return this.mEnumCode;
        }

        @Deprecated
        public int getHeight() {
            return this.getNativeAdViewTypeApi(this.mEnumCode).getHeight();
        }

        private NativeAdViewTypeApi getNativeAdViewTypeApi(int v) {
            if(this.mNativeAdViewTypeApi == null) {
                this.mNativeAdViewTypeApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewTypeApi(v);
            }
            return this.mNativeAdViewTypeApi;
        }

        @Deprecated
        public int getValue() {
            return this.getNativeAdViewTypeApi(this.mEnumCode).getValue();
        }

        @Deprecated
        public int getWidth() {
            return this.getNativeAdViewTypeApi(this.mEnumCode).getWidth();
        }
    }

    public static View render(Context context0, NativeAd nativeAd0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeAd0, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeAdViewApi().render(context0, nativeAd0);
    }

    @Deprecated
    public static View render(Context context0, NativeAd nativeAd0, Type nativeAdView$Type0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeAd0, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeAdViewApi().render(context0, nativeAd0, nativeAdView$Type0);
    }

    @Deprecated
    public static View render(Context context0, NativeAd nativeAd0, Type nativeAdView$Type0, NativeAdViewAttributes nativeAdViewAttributes0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeAd0, "nativeAd must be not null");
        Preconditions.checkNotNull(nativeAdView$Type0, "type must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeAdViewApi().render(context0, nativeAd0, nativeAdView$Type0, nativeAdViewAttributes0);
    }

    public static View render(Context context0, NativeAd nativeAd0, NativeAdViewAttributes nativeAdViewAttributes0) {
        Preconditions.checkNotNull(context0, "context must be not null");
        Preconditions.checkNotNull(nativeAd0, "nativeAd must be not null");
        return DynamicLoaderFactory.makeLoader(context0).createNativeAdViewApi().render(context0, nativeAd0, nativeAdViewAttributes0);
    }
}

