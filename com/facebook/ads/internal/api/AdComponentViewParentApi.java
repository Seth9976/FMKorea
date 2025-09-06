package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;

@Keep
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View arg1);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int arg1, int arg2);

    void onVisibilityChanged(View arg1, int arg2);

    void setMeasuredDimension(int arg1, int arg2);
}

