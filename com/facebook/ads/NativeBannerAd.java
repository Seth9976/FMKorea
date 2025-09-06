package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.List;

@Keep
public class NativeBannerAd extends NativeAdBase {
    private final NativeBannerAdApi mNativeBannerAdApi;

    public NativeBannerAd(Context context0, NativeAdBaseApi nativeAdBaseApi0) {
        super(nativeAdBaseApi0);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context0).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeBannerAd(Context context0, String s) {
        super(context0, s);
        this.mNativeBannerAdApi = DynamicLoaderFactory.makeLoader(context0).createNativeBannerAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view0, ImageView imageView0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view0, imageView0);
    }

    public void registerViewForInteraction(View view0, ImageView imageView0, List list0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view0, imageView0, list0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view0, mediaView0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, List list0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeBannerAdApi.registerViewForInteraction(view0, mediaView0, list0);
    }
}

