package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.MediaView;
import java.util.List;

@Keep
public interface NativeBannerAdApi {
    void registerViewForInteraction(View arg1, ImageView arg2);

    void registerViewForInteraction(View arg1, ImageView arg2, List arg3);

    void registerViewForInteraction(View arg1, MediaView arg2);

    void registerViewForInteraction(View arg1, MediaView arg2, List arg3);
}

