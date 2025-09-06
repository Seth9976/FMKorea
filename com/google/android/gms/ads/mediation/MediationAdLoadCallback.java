package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

public interface MediationAdLoadCallback {
    void onFailure(AdError arg1);

    @Deprecated
    void onFailure(String arg1);

    Object onSuccess(Object arg1);
}

