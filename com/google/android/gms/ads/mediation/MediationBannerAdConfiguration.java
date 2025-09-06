package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;

public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zza;

    public MediationBannerAdConfiguration(Context context0, String s, Bundle bundle0, Bundle bundle1, boolean z, Location location0, int v, int v1, String s1, AdSize adSize0, String s2) {
        super(context0, s, bundle0, bundle1, z, location0, v, v1, s1, s2);
        this.zza = adSize0;
    }

    public AdSize getAdSize() {
        return this.zza;
    }
}

