package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class NativeAdScrollView extends LinearLayout {
    @Keep
    public interface AdViewProvider {
        View createView(NativeAd arg1, int arg2);

        void destroyView(NativeAd arg1, View arg2);
    }

    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, int v) {
        this(context0, nativeAdsManager0, null, v, null, null, 10);
    }

    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, int v, NativeAdViewAttributes nativeAdViewAttributes0) {
        this(context0, nativeAdsManager0, null, v, null, nativeAdViewAttributes0, 10);
    }

    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, int v, NativeAdViewAttributes nativeAdViewAttributes0, int v1) {
        this(context0, nativeAdsManager0, null, v, null, nativeAdViewAttributes0, v1);
    }

    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, AdViewProvider nativeAdScrollView$AdViewProvider0) {
        this(context0, nativeAdsManager0, nativeAdScrollView$AdViewProvider0, 0, null, null, 10);
    }

    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, AdViewProvider nativeAdScrollView$AdViewProvider0, int v) {
        this(context0, nativeAdsManager0, nativeAdScrollView$AdViewProvider0, 0, null, null, v);
    }

    private NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, AdViewProvider nativeAdScrollView$AdViewProvider0, int v, Type nativeAdView$Type0, NativeAdViewAttributes nativeAdViewAttributes0, int v1) {
        super(context0);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdScrollViewApi(this, context0, nativeAdsManager0, nativeAdScrollView$AdViewProvider0, v, nativeAdView$Type0, nativeAdViewAttributes0, v1);
    }

    @Deprecated
    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, Type nativeAdView$Type0) {
        this(context0, nativeAdsManager0, null, 0, nativeAdView$Type0, null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, Type nativeAdView$Type0, NativeAdViewAttributes nativeAdViewAttributes0) {
        this(context0, nativeAdsManager0, null, 0, nativeAdView$Type0, nativeAdViewAttributes0, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context0, NativeAdsManager nativeAdsManager0, Type nativeAdView$Type0, NativeAdViewAttributes nativeAdViewAttributes0, int v) {
        this(context0, nativeAdsManager0, null, 0, nativeAdView$Type0, nativeAdViewAttributes0, v);
    }

    public void setInset(int v) {
        this.mNativeAdScrollViewApi.setInset(v);
    }
}

