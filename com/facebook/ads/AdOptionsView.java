package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class AdOptionsView extends AdComponentFrameLayout {
    @Keep
    public static enum Orientation {
        HORIZONTAL,
        VERTICAL;

    }

    private final AdOptionsViewApi mAdOptionsViewApi;

    public AdOptionsView(Context context0, NativeAdBase nativeAdBase0, NativeAdLayout nativeAdLayout0) {
        super(context0);
        AdOptionsViewApi adOptionsViewApi0 = DynamicLoaderFactory.makeLoader(context0).createAdOptionsView(context0, nativeAdBase0, nativeAdLayout0, this);
        this.mAdOptionsViewApi = adOptionsViewApi0;
        this.attachAdComponentViewApi(adOptionsViewApi0);
    }

    public AdOptionsView(Context context0, NativeAdBase nativeAdBase0, NativeAdLayout nativeAdLayout0, Orientation adOptionsView$Orientation0, int v) {
        super(context0);
        AdOptionsViewApi adOptionsViewApi0 = DynamicLoaderFactory.makeLoader(context0).createAdOptionsView(context0, nativeAdBase0, nativeAdLayout0, adOptionsView$Orientation0, v, this);
        this.mAdOptionsViewApi = adOptionsViewApi0;
        this.attachAdComponentViewApi(adOptionsViewApi0);
    }

    public void setIconColor(int v) {
        this.mAdOptionsViewApi.setIconColor(v);
    }

    public void setIconSizeDp(int v) {
        this.mAdOptionsViewApi.setIconSizeDp(v);
    }

    public void setSingleIcon(boolean z) {
        this.mAdOptionsViewApi.setSingleIcon(z);
    }
}

