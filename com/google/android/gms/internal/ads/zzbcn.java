package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbcn extends zzatv implements zzbcp {
    zzbcn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbcp
    public final void zze(zzbcm zzbcm0) {
        Parcel parcel0 = this.zza();
        zzatx.zzf(parcel0, zzbcm0);
        this.zzbh(1, parcel0);
    }
}

