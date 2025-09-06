package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView.Type;

@Keep
public interface NativeBannerAdViewApi {
    View render(Context arg1, NativeBannerAd arg2, Type arg3);

    View render(Context arg1, NativeBannerAd arg2, Type arg3, NativeAdViewAttributes arg4);
}

