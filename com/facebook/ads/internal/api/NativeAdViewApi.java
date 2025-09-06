package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;

@Keep
public interface NativeAdViewApi {
    View render(Context arg1, NativeAd arg2);

    @Deprecated
    View render(Context arg1, NativeAd arg2, Type arg3);

    @Deprecated
    View render(Context arg1, NativeAd arg2, Type arg3, NativeAdViewAttributes arg4);

    View render(Context arg1, NativeAd arg2, NativeAdViewAttributes arg3);
}

