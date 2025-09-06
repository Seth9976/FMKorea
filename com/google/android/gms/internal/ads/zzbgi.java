package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbgi extends zzatv implements zzbgk {
    zzbgi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgt0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbgt0);
        this.zzbh(1, parcel0);
    }
}

