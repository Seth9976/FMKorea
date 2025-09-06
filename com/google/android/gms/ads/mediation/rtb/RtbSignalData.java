package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    private final AdSize zzd;

    public RtbSignalData(Context context0, List list0, Bundle bundle0, AdSize adSize0) {
        this.zza = context0;
        this.zzb = list0;
        this.zzc = bundle0;
        this.zzd = adSize0;
    }

    public AdSize getAdSize() {
        return this.zzd;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        return this.zzb == null || this.zzb.size() <= 0 ? null : ((MediationConfiguration)this.zzb.get(0));
    }

    public List getConfigurations() {
        return this.zzb;
    }

    public Context getContext() {
        return this.zza;
    }

    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}

