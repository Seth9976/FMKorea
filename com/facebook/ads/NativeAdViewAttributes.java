package com.facebook.ads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public class NativeAdViewAttributes {
    private final NativeAdViewAttributesApi mNativeAdViewAttributesApi;

    @Deprecated
    public NativeAdViewAttributes() {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdViewAttributesApi();
    }

    public NativeAdViewAttributes(Context context0) {
        this.mNativeAdViewAttributesApi = DynamicLoaderFactory.makeLoader(context0).createNativeAdViewAttributesApi();
    }

    @Deprecated
    public boolean getAutoplay() {
        return AdSettings.isVideoAutoplay();
    }

    @Deprecated
    public boolean getAutoplayOnMobile() {
        return AdSettings.isVideoAutoplayOnMobile();
    }

    @Deprecated
    public int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public int getButtonBorderColor() {
        return 0;
    }

    @Deprecated
    public int getButtonColor() {
        return 0;
    }

    @Deprecated
    public int getButtonTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public int getDescriptionTextSize() {
        return 0;
    }

    public NativeAdViewAttributesApi getInternalAttributes() {
        return this.mNativeAdViewAttributesApi;
    }

    @Deprecated
    public int getTitleTextColor() {
        return 0;
    }

    @Deprecated
    public int getTitleTextSize() {
        return 0;
    }

    @Deprecated
    public Typeface getTypeface() {
        return null;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplay(boolean z) {
        return this;
    }

    @Deprecated
    public NativeAdViewAttributes setAutoplayOnMobile(boolean z) {
        return this;
    }

    public NativeAdViewAttributes setBackgroundColor(int v) {
        this.mNativeAdViewAttributesApi.setBackgroundColor(v);
        return this;
    }

    public NativeAdViewAttributes setButtonBorderColor(int v) {
        this.mNativeAdViewAttributesApi.setCTABorderColor(v);
        return this;
    }

    public NativeAdViewAttributes setButtonColor(int v) {
        this.mNativeAdViewAttributesApi.setCTABackgroundColor(v);
        return this;
    }

    public NativeAdViewAttributes setButtonTextColor(int v) {
        this.mNativeAdViewAttributesApi.setCTATextColor(v);
        return this;
    }

    public NativeAdViewAttributes setDescriptionTextColor(int v) {
        this.mNativeAdViewAttributesApi.setSecondaryTextColor(v);
        return this;
    }

    public NativeAdViewAttributes setTitleTextColor(int v) {
        this.mNativeAdViewAttributesApi.setPrimaryTextColor(v);
        return this;
    }

    public NativeAdViewAttributes setTypeface(Typeface typeface0) {
        this.mNativeAdViewAttributesApi.setTypeface(typeface0);
        return this;
    }
}

