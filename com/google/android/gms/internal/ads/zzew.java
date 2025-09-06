package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback.DisplayInfoListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

final class zzew extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzez zza;

    public zzew(zzez zzez0) {
        this.zza = zzez0;
    }

    @Override  // android.telephony.TelephonyCallback$DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo0) {
        int v = telephonyDisplayInfo0.getOverrideNetworkType();
        int v1 = 5;
        zzez zzez0 = this.zza;
        if(1 == (v != 3 && (v != 4 && v != 5) ? 0 : 1)) {
            v1 = 10;
        }
        zzez.zzc(zzez0, v1);
    }
}

