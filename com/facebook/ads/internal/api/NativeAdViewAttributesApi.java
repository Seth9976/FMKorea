package com.facebook.ads.internal.api;

import android.graphics.Typeface;
import androidx.annotation.Keep;

@Keep
public interface NativeAdViewAttributesApi {
    void setBackgroundColor(int arg1);

    void setCTABackgroundColor(int arg1);

    void setCTABorderColor(int arg1);

    void setCTATextColor(int arg1);

    void setPrimaryTextColor(int arg1);

    void setSecondaryTextColor(int arg1);

    void setTypeface(Typeface arg1);
}

