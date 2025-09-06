package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class zzbvr extends zzatv implements zzbvt {
    zzbvr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final int zze() {
        Parcel parcel0 = this.zzbg(2, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvt
    public final String zzf() {
        Parcel parcel0 = this.zzbg(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

