package com.facebook.ads.internal.bridge.gms;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@Keep
public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public AdvertisingId(String s, boolean z) {
        this.mId = s;
        this.mLimitAdTracking = z;
    }

    @SuppressLint({"CatchGeneralException"})
    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context0) {
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(context0);
            return advertisingIdClient$Info0 == null ? null : new AdvertisingId(advertisingIdClient$Info0.getId(), advertisingIdClient$Info0.isLimitAdTrackingEnabled());
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }
}

