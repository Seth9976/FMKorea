package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbkq extends zzatv implements zzbks {
    zzbkq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbks
    public final void zze(String s) {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzbh(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbks
    public final void zzf() {
        this.zzbh(2, this.zza());
    }
}

