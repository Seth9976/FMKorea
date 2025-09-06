package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbek;

public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbek zza;

    public MediationNativeAdConfiguration(Context context0, String s, Bundle bundle0, Bundle bundle1, boolean z, Location location0, int v, int v1, String s1, String s2, zzbek zzbek0) {
        super(context0, s, bundle0, bundle1, z, location0, v, v1, s1, s2);
        this.zza = zzbek0;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbek.zza(this.zza);
    }
}

