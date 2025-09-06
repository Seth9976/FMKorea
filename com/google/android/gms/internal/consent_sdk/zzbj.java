package com.google.android.gms.internal.consent_sdk;

import W1.e;
import W1.f.a;
import android.util.Log;

public final class zzbj implements a {
    public static final zzbj zza;

    static {
        zzbj.zza = new zzbj();
    }

    @Override  // W1.f$a
    public final void onConsentFormLoadFailure(e e0) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=" + e0.b());
    }
}

