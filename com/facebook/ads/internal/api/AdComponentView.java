package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.Keep;

@Keep
public interface AdComponentView {
    void addView(View arg1);

    void addView(View arg1, int arg2);

    void addView(View arg1, int arg2, int arg3);

    void addView(View arg1, int arg2, ViewGroup.LayoutParams arg3);

    void addView(View arg1, ViewGroup.LayoutParams arg2);

    void onWindowFocusChanged(boolean arg1);

    void setLayoutParams(ViewGroup.LayoutParams arg1);
}

