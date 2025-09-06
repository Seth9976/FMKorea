package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.AdOptionsView.Orientation;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView.AdViewProvider;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdRatingApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import org.json.JSONObject;

@Keep
public interface DynamicLoader {
    AdCompanionViewApi createAdCompanionViewApi();

    AdOptionsViewApi createAdOptionsView(Context arg1, NativeAdBase arg2, NativeAdLayout arg3, Orientation arg4, int arg5, AdOptionsView arg6);

    AdOptionsViewApi createAdOptionsView(Context arg1, NativeAdBase arg2, NativeAdLayout arg3, AdOptionsView arg4);

    AdSettingsApi createAdSettingsApi();

    AdSizeApi createAdSizeApi(int arg1);

    AdViewApi createAdViewApi(Context arg1, String arg2, AdSize arg3, AdViewParentApi arg4, AdView arg5);

    AdViewApi createAdViewApi(Context arg1, String arg2, String arg3, AdViewParentApi arg4, AdView arg5);

    AudienceNetworkActivityApi createAudienceNetworkActivity(AudienceNetworkActivity arg1, AudienceNetworkActivityApi arg2);

    AudienceNetworkAdsApi createAudienceNetworkAdsApi();

    BidderTokenProviderApi createBidderTokenProviderApi();

    DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi();

    InterstitialAdApi createInterstitialAd(Context arg1, String arg2, InterstitialAd arg3);

    MediaViewApi createMediaViewApi();

    MediaViewVideoRendererApi createMediaViewVideoRendererApi();

    NativeAdApi createNativeAdApi(NativeAd arg1, NativeAdBaseApi arg2);

    NativeAdApi createNativeAdApi(NativeAdBase arg1, NativeAd arg2, NativeAdBaseApi arg3);

    NativeAdBaseApi createNativeAdBaseApi(Context arg1, String arg2);

    NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi arg1);

    NativeAdBase createNativeAdBaseFromBidPayload(Context arg1, String arg2, String arg3);

    NativeAdImageApi createNativeAdImageApi(JSONObject arg1);

    NativeAdLayoutApi createNativeAdLayoutApi();

    NativeAdRatingApi createNativeAdRatingApi(JSONObject arg1);

    NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView arg1, Context arg2, NativeAdsManager arg3, AdViewProvider arg4, int arg5, Type arg6, NativeAdViewAttributes arg7, int arg8);

    NativeAdViewApi createNativeAdViewApi();

    NativeAdViewAttributesApi createNativeAdViewAttributesApi();

    NativeAdViewTypeApi createNativeAdViewTypeApi(int arg1);

    NativeAdsManagerApi createNativeAdsManagerApi(Context arg1, String arg2, int arg3);

    NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd arg1, NativeAdBaseApi arg2);

    NativeBannerAdViewApi createNativeBannerAdViewApi();

    NativeComponentTagApi createNativeComponentTagApi();

    RewardedInterstitialAdApi createRewardedInterstitialAd(Context arg1, String arg2, RewardedInterstitialAd arg3);

    RewardedVideoAdApi createRewardedVideoAd(Context arg1, String arg2, RewardedVideoAd arg3);

    InitApi getInitApi();

    void maybeInitInternally(Context arg1);
}

