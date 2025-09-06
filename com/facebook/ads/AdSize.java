package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.Serializable;

@Keep
public class AdSize implements Serializable {
    @Deprecated
    public static final AdSize BANNER_320_50;
    public static final AdSize BANNER_HEIGHT_50;
    public static final AdSize BANNER_HEIGHT_90;
    public static final AdSize INTERSTITIAL;
    public static final AdSize RECTANGLE_HEIGHT_250;
    private final int UNDEFINED;
    private AdSizeApi mAdSizeApi;
    private final int mInitHeight;
    private final int mInitSizeType;
    private final int mInitWidth;

    static {
        AdSize.BANNER_320_50 = new AdSize(4);
        AdSize.INTERSTITIAL = new AdSize(100);
        AdSize.BANNER_HEIGHT_50 = new AdSize(5);
        AdSize.BANNER_HEIGHT_90 = new AdSize(6);
        AdSize.RECTANGLE_HEIGHT_250 = new AdSize(7);
    }

    private AdSize(int v) {
        this.UNDEFINED = -1;
        this.mInitSizeType = v;
        this.mInitWidth = -1;
        this.mInitHeight = -1;
    }

    public AdSize(int v, int v1) {
        this.UNDEFINED = -1;
        this.mInitSizeType = -1;
        this.mInitWidth = v;
        this.mInitHeight = v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.getWidth() == ((AdSize)object0).getWidth() ? this.getHeight() == ((AdSize)object0).getHeight() : false;
    }

    public static AdSize fromWidthAndHeight(int v, int v1) {
        AdSize adSize0 = AdSize.INTERSTITIAL;
        if(adSize0.getHeight() == v1 && adSize0.getWidth() == v) {
            return adSize0;
        }
        AdSize adSize1 = AdSize.BANNER_320_50;
        if(adSize1.getHeight() == v1 && adSize1.getWidth() == v) {
            return adSize1;
        }
        AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
        if(adSize2.getHeight() == v1 && adSize2.getWidth() == v) {
            return adSize2;
        }
        AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
        if(adSize3.getHeight() == v1 && adSize3.getWidth() == v) {
            return adSize3;
        }
        AdSize adSize4 = AdSize.RECTANGLE_HEIGHT_250;
        if(adSize4.getHeight() != v1 || adSize4.getWidth() != v) {
            throw new IllegalArgumentException("Can\'t create AdSize using this width and height.");
        }
        return adSize4;
    }

    private AdSizeApi getAdSizeApi(int v) {
        if(this.mAdSizeApi == null) {
            this.mAdSizeApi = DynamicLoaderFactory.makeLoaderUnsafe().createAdSizeApi(v);
        }
        return this.mAdSizeApi;
    }

    public int getHeight() {
        return this.mInitSizeType == -1 ? this.mInitHeight : this.getAdSizeApi(this.mInitSizeType).getHeight();
    }

    public int getWidth() {
        return this.mInitSizeType == -1 ? this.mInitWidth : this.getAdSizeApi(this.mInitSizeType).getWidth();
    }

    @Override
    public int hashCode() {
        return this.getWidth() * 0x1F + this.getHeight();
    }
}

