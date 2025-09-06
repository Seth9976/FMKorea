package com.facebook.ads.internal.api;

import androidx.annotation.Keep;

@Keep
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int arg1);

    void setIconSizeDp(int arg1);

    void setSingleIcon(boolean arg1);
}

