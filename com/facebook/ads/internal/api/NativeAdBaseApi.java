package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View.OnTouchListener;
import androidx.annotation.Keep;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder;
import com.facebook.ads.NativeAdBase.NativeLoadAdConfig;
import com.facebook.ads.NativeAdBase;

@Keep
public interface NativeAdBaseApi {
    NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase arg1);

    void destroy();

    void downloadMedia();

    String getAdBodyText();

    String getAdCallToAction();

    NativeAdImageApi getAdChoicesIcon();

    String getAdChoicesImageUrl();

    String getAdChoicesLinkUrl();

    String getAdChoicesText();

    NativeAdImageApi getAdCoverImage();

    String getAdHeadline();

    NativeAdImageApi getAdIcon();

    String getAdLinkDescription();

    String getAdSocialContext();

    @Deprecated
    NativeAdRatingApi getAdStarRating();

    String getAdTranslation();

    String getAdUntrimmedBodyText();

    String getAdvertiserName();

    float getAspectRatio();

    String getId();

    String getPlacementId();

    Drawable getPreloadedIconViewDrawable();

    String getPromotedTranslation();

    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(NativeLoadAdConfig arg1);

    void onCtaBroadcast();

    void setExtraHints(ExtraHints arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void unregisterView();
}

