package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

public interface SignalCallbacks {
    void onFailure(AdError arg1);

    @Deprecated
    void onFailure(String arg1);

    void onSuccess(String arg1);
}

