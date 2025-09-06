package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbjq extends zzatv implements zzbjs {
    zzbjq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzbjs
    public final void zze() {
        this.zzbh(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbjs
    public final void zzf(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(1, parcel0);
    }
}

