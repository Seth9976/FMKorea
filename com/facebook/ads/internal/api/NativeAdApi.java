package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd.AdCreativeType;
import com.facebook.ads.VideoAutoplayBehavior;
import java.util.List;

@Keep
public interface NativeAdApi {
    AdCreativeType getAdCreativeType();

    VideoAutoplayBehavior getVideoAutoplayBehavior();

    void registerViewForInteraction(View arg1, MediaView arg2);

    void registerViewForInteraction(View arg1, MediaView arg2, ImageView arg3);

    void registerViewForInteraction(View arg1, MediaView arg2, ImageView arg3, List arg4);

    void registerViewForInteraction(View arg1, MediaView arg2, MediaView arg3);

    void registerViewForInteraction(View arg1, MediaView arg2, MediaView arg3, List arg4);

    void registerViewForInteraction(View arg1, MediaView arg2, List arg3);
}

