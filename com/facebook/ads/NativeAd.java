package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.List;

@Keep
public class NativeAd extends NativeAdBase {
    @Keep
    public static enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN;

    }

    private NativeAdApi mNativeAdApi;

    public NativeAd(Context context0, NativeAdBase nativeAdBase0) {
        super(context0, nativeAdBase0);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdApi(nativeAdBase0, this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context0, NativeAdBaseApi nativeAdBaseApi0) {
        super(nativeAdBaseApi0);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context0, String s) {
        super(context0, s);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    @Deprecated
    VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, ImageView imageView0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0, imageView0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, ImageView imageView0, List list0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0, imageView0, list0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, MediaView mediaView1) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0, mediaView1);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, MediaView mediaView1, List list0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0, mediaView1, list0);
    }

    public void registerViewForInteraction(View view0, MediaView mediaView0, List list0) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view0, mediaView0, list0);
    }
}

