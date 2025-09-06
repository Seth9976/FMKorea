package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbjn extends zzatv implements zzbjp {
    zzbjn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zzb(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(1, parcel0);
    }
}

