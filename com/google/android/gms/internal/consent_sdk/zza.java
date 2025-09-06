package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zza {
    private final Application zza;

    public zza(Application application0) {
        this.zza = application0;
    }

    public final String zza() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.zza).getId();
        }
        catch(IOException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", iOException0);
            return null;
        }
    }
}

