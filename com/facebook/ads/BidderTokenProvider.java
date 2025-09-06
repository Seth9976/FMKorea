package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

@Keep
public final class BidderTokenProvider {
    public static String getBidderToken(Context context0) {
        Preconditions.checkNotNull(context0, "Context can not be null.");
        return DynamicLoaderFactory.makeLoader(context0).createBidderTokenProviderApi().getBidderToken(context0);
    }
}

