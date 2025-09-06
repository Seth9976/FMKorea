package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class NativeAdLayout extends AdComponentFrameLayout {
    private NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayout(Context context0) {
        super(context0);
        this.initializeSelf(context0);
    }

    public NativeAdLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.initializeSelf(context0);
    }

    public NativeAdLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initializeSelf(context0);
    }

    public NativeAdLayout(Context context0, NativeAdLayoutApi nativeAdLayoutApi0) {
        super(context0);
        this.mNativeAdLayoutApi = nativeAdLayoutApi0;
        this.attachAdComponentViewApi(nativeAdLayoutApi0);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    private void initializeSelf(Context context0) {
        NativeAdLayoutApi nativeAdLayoutApi0 = DynamicLoaderFactory.makeLoader(context0).createNativeAdLayoutApi();
        this.mNativeAdLayoutApi = nativeAdLayoutApi0;
        this.attachAdComponentViewApi(nativeAdLayoutApi0);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public void setMaxWidth(int v) {
        this.mNativeAdLayoutApi.setMaxWidth(v);
    }

    public void setMinWidth(int v) {
        this.mNativeAdLayoutApi.setMinWidth(v);
    }
}

